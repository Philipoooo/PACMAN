package tud.ai1.pacman.model.level;

import tud.ai1.pacman.exceptions.InvalidLevelCharacterException;
import tud.ai1.pacman.exceptions.InvalidLevelFormatException;
import tud.ai1.pacman.exceptions.NoPacmanSpawnPointException;
import tud.ai1.pacman.util.Consts;
import tud.ai1.pacman.util.FileOperations;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Laedt einen Level aus einer Datei oder einem String.
 *
 * @author Simon Breitfelder
 * @author Dominik Puellen
 * @author Robert Cieslinski
 * @author Kurt Cieslinski
 */
public class LevelParser {

    /**
     * Laedt den Level aus einer Datei.
     *
     * @throws InvalidLevelCharacterException falls der eingelesene Level ein unbekanntes Zeichen enthaelt
     * @throws InvalidLevelFormatException falls der eingelesene Level nicht rechteckig ist
     * @throws NoPacmanSpawnPointException falls der eingelesene Level keinen Pac-Spawner enthaelt
     */
    public static Level fromFile(String file) throws IllegalArgumentException,InvalidLevelCharacterException, InvalidLevelFormatException, NoPacmanSpawnPointException {
        //TODO Aufgabe 4.2a
    
    }

    /**
     * Laedt den Level aus einem String.
     *
     * @throws InvalidLevelCharacterException falls der eingelesene Level ein unbekanntes Zeichen enthaelt
     * @throws InvalidLevelFormatException falls der eingelesene Level nicht rechteckig ist
     * @throws NoPacmanSpawnPointException falls der eingelesene Level keinen Pac-Spawner enthaelt
     */
    public static Level fromString(String content) throws IllegalArgumentException,InvalidLevelCharacterException, InvalidLevelFormatException, NoPacmanSpawnPointException {
    	//TODO Aufgabe 4.2b
    }

    /**
     * @param file Dateipfad des Levels
     * @return eine lesbare Version des Levelnamens
     */
    public static String getLevelName(String file) throws IllegalArgumentException {
    	if(file==null)throw new IllegalArgumentException();
        String fname = file;
        // dateinamen filtern
        if (fname.contains("/"))
            fname = fname.substring(fname.lastIndexOf("/") + 1);
        if (fname.contains("\\"))
            fname = fname.substring(fname.lastIndexOf("\\") + 1);
        // dateiendung entfernen
        if (fname.contains("."))
            fname = fname.substring(0, fname.indexOf("."));

        return fname.replace("_", " ");
    }
}
