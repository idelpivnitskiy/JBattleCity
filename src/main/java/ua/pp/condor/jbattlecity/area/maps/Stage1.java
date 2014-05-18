package ua.pp.condor.jbattlecity.area.maps;

import java.awt.Image;

import ua.pp.condor.jbattlecity.area.Cell;
import ua.pp.condor.jbattlecity.utils.Images;

public class Stage1 implements IMap {
    
    private final Cell[][] map = {
        /*                      1                                                  2                                                  3                                                  4                                                  5                                                  6                                                 7                                                   8                                                  9                                                 10                                                 11                                                 12                                                  13                     */
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*1*/   {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*2*/   {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*3*/   {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.conc,  Cell.conc,  Cell.conc,  Cell.conc,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*4*/   {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.conc,  Cell.conc,  Cell.conc,  Cell.conc,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.conc,  Cell.conc,  Cell.conc,  Cell.conc,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.conc,  Cell.conc,  Cell.conc,  Cell.conc,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*5*/   {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*6*/   {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*7*/   {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall },
        {Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall },

        {Cell.conc,  Cell.conc,  Cell.conc,  Cell.conc,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.conc,  Cell.conc,  Cell.conc,  Cell.conc },
/*8*/   {Cell.conc,  Cell.conc,  Cell.conc,  Cell.conc,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.conc,  Cell.conc,  Cell.conc,  Cell.conc },
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*9*/   {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*10*/  {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*11*/  {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*12*/  {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.wall,  Cell.wall,  Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.wall,  Cell.wall,  Cell.wall,  Cell.wall,     Cell.empty, Cell.empty, Cell.empty, Cell.empty},

        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.wall,  Cell.wall,     Cell.base,  Cell.base,  Cell.base,  Cell.base,     Cell.wall,  Cell.wall,  Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
/*13*/  {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.wall,  Cell.wall,     Cell.base,  Cell.base,  Cell.base,  Cell.base,     Cell.wall,  Cell.wall,  Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.wall,  Cell.wall,     Cell.base,  Cell.base,  Cell.base,  Cell.base,     Cell.wall,  Cell.wall,  Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
        {Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.wall,  Cell.wall,     Cell.base,  Cell.base,  Cell.base,  Cell.base,     Cell.wall,  Cell.wall,  Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty,    Cell.empty, Cell.empty, Cell.empty, Cell.empty},
    };

    @Override
    public Cell getCell(int x, int y) {
        return map[y][x];
    }
    
    @Override
    public Image getMapImage() {
        return Images.getStage1();
    }

}
