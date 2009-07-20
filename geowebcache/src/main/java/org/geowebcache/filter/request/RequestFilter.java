/**
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * @author Arne Kepp, OpenGeo, Copyright 2009
 */
package org.geowebcache.filter.request;

import org.geowebcache.conveyor.ConveyorTile;

/** 
 * This is just a dummy class. Should be abstract, 
 * but that gets tricky with XStream
 */
public class RequestFilter {
    
    String name;
    
    public void apply(ConveyorTile convTile) throws RequestFilterException {
        
    }
    
    protected String getName() { 
        return name;
    }
}