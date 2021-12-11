package AdapterPattern;

public class TongSampah implements AdapterJualSampah{
    private AdapterJualSampah tong;
    private int total;

    public TongSampah(AdapterJualSampah tong, int total){
        this.tong = tong;
        this.total = total;
    }

    public int getTotal(){
        return total;
    }

    @Override
    public int getRubbishBin(){
        int garbage = tong.getRubbishBin();
        return jualSampah(garbage, getTotal());
    }

    public int jualSampah(int sum, int jumlah){
        return sum*jumlah;
    }
}
