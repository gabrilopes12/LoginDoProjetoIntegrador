/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.logindoprojetointegrador;

import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;

public class MusicPlayer {
    private static Clip clip;
    private static Long currentFrame;
    private static FloatControl volumeControl;

    public static void playMusic(String resourcePath) {
        try {
            InputStream audioSrc = MusicPlayer.class.getResourceAsStream(resourcePath);
            if (audioSrc != null) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audioSrc);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop contínuo
            } else {
                System.out.println("Arquivo de música não encontrado: " + resourcePath);
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void pauseMusic() {
        if (clip != null && clip.isRunning()) {
            currentFrame = clip.getMicrosecondPosition();
            clip.stop();
        }
    }

    public static void resumeMusic() {
        if (clip != null && !clip.isRunning()) {
            clip.setMicrosecondPosition(currentFrame);
            clip.start();
        }
    }

    public static void stopMusic() {
        if (clip != null) {
            currentFrame = 0L;
            clip.stop();
            clip.close();
        }
    }

    public static void increaseVolume() {
        if (volumeControl != null) {
            float currentVolume = volumeControl.getValue();
            float maxVolume = volumeControl.getMaximum();
            if (currentVolume < maxVolume) {
                volumeControl.setValue(Math.min(maxVolume, currentVolume + 2.0f)); // Aumenta o volume em 2 
            }
        }
    }

    public static void decreaseVolume() {
        if (volumeControl != null) {
            float currentVolume = volumeControl.getValue();
            float minVolume = volumeControl.getMinimum();
            if (currentVolume > minVolume) {
                volumeControl.setValue(Math.max(minVolume, currentVolume - 2.0f)); // Diminui o volume em 2 
            }
        }
    }
}
