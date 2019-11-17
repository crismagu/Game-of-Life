import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GridTest {
    Grid myGrid;
    @Before
    public void init(){
        myGrid = new Grid(9,9);
    }


    @Test
    public void doesCellExist () {
        myGrid.setCellToOccupied(0,0);
        Assert.assertTrue(myGrid.doesCellExist(0,0));

    }
    @Test
    public void setSpaceToOccupied() {
        myGrid.setCellToOccupied(0,0);
        String[][] grid = myGrid.getGrid();
        Assert.assertEquals("occupied", grid[0][0]);
    }
    @Test
    public void doesCellNotExist () {
        myGrid.setCellToUnoccupied(1,5);
        Assert.assertFalse(myGrid.doesCellExist(1,5));

    }


}


