package restaurant2;

/**
 *
 * @author Iscariot
 */
class TableService<T>{
    private T nik;

    public TableService(T nik) {

        this.nik = nik;

    }

    public void setNik(T nik) {
        this.nik = nik;
    }

    public T getNik() {
        return nik;
    }

    public void getType() {
        System.out.println("Tipe awalnya " + nik.getClass().getName());
    }
}