// Ders adında soyut bir sınıf
abstract class Ders implements DersIsle {
    protected String DersAd;
    protected String DersSinif;

    // Yapılandırıcı
    public Ders(String DersAd, String DersSinif) {
        this.DersAd = DersAd;
        this.DersSinif = DersSinif;
    }

    // Metot
    public String IsmiBuyut(String DersAd) {
        return DersAd.toUpperCase();
    }

    // Soyut metotlar
    public abstract String IsimGetir();

    public abstract String SinifGetir();
}

// DersIsle adında bir arayüz
interface DersIsle {
    void SozluSunum();

    void YaziliSunum();
}

// Matematik sınıfı
class Matematik extends Ders {
    public Matematik(String DersAd, String DersSinif) {
        super(DersAd, DersSinif);
    }

    @Override
    public String IsimGetir() {
        return "Matematik Dersi: " + DersAd;
    }

    @Override
    public String SinifGetir() {
        return "Matematik Sınıfı: " + DersSinif;
    }

    @Override
    public void SozluSunum() {
        System.out.println("Matematik dersi için sözlü sunum yapılıyor.");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Matematik dersi için yazılı sunum yapılıyor.");
    }
}

// Fizik sınıfı
class Fizik extends Ders {
    public Fizik(String DersAd, String DersSinif) {
        super(DersAd, DersSinif);
    }

    @Override
    public String IsimGetir() {
        return "Fizik Dersi: " + DersAd;
    }

    @Override
    public String SinifGetir() {
        return "Fizik Sınıfı: " + DersSinif;
    }

    @Override
    public void SozluSunum() {
        System.out.println("Fizik dersi için sözlü sunum yapılıyor.");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Fizik dersi için yazılı sunum yapılıyor.");
    }
}

// Kimya sınıfı
class Kimya extends Ders {
    public Kimya(String DersAd, String DersSinif) {
        super(DersAd, DersSinif);
    }

    @Override
    public String IsimGetir() {
        return "Kimya Dersi: " + DersAd;
    }

    @Override
    public String SinifGetir() {
        return "Kimya Sınıfı: " + DersSinif;
    }

    @Override
    public void SozluSunum() {
        System.out.println("Kimya dersi için sözlü sunum yapılıyor.");
    }

    @Override
    public void YaziliSunum() {
        System.out.println("Kimya dersi için yazılı sunum yapılıyor.");
    }
}

// Ana sınıf
public class SoyutSiniflar {
    public static void main(String[] args) {
        // Nesneleri oluşturma
        Matematik matematik = new Matematik("Matematik", "101");
        Fizik fizik = new Fizik("Fizik", "102");
        Kimya kimya = new Kimya("Kimya", "103");

        // Metotları ve soyut metotları çağırma
        System.out.println(matematik.IsimGetir());
        System.out.println(matematik.SinifGetir());
        System.out.println("Büyük Harflerle: " + matematik.IsmiBuyut(matematik.DersAd));
        matematik.SozluSunum();
        matematik.YaziliSunum();

        System.out.println(fizik.IsimGetir());
        System.out.println(fizik.SinifGetir());
        System.out.println("Büyük Harflerle: " + fizik.IsmiBuyut(fizik.DersAd));
        fizik.SozluSunum();
        fizik.YaziliSunum();

        System.out.println(kimya.IsimGetir());
        System.out.println(kimya.SinifGetir());
        System.out.println("Büyük Harflerle: " + kimya.IsmiBuyut(kimya.DersAd));
        kimya.SozluSunum();
        kimya.YaziliSunum();
    }
}
