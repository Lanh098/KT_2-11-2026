package vn.edu.uye.datphong.model
import java.io.Serializable
class DonDatPhong (
    val hoTen : String,
    val sdt : String,
    val email : String,
    val maLoaiPhong : String,
    val ngayNhan : String,
    val soDem : Int,
    val soKhach : Int,
    val ghiChu : String = ""
)
fun tomTat(): String{
    return "Khách: $hoTen - Mã phòng: $maLoaiPhong - Ngày nhận: $ngayNhan - Số đêm"
}