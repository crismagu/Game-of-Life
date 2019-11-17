public class Grid {
    private String[][] grid;
    private int x;
    private int y;
    public Grid (int x, int y){
        this.grid = new String[x][y];
     }
    public boolean doesCellExist (int x, int y) {
        return this.grid[x][y] == "occupied";
    }
    public void setCellToOccupied (int x, int y) {
        this.grid [x][y] = "occupied";
    }
    public String[][] getGrid() {
        return this.grid;
    }

    public void setCellToUnoccupied (int x, int y) {
        this.grid[x][y] = null;
    }

}


