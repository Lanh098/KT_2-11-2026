package vn.edu.uye.datphong.helper
import vn.edu.uye.datphong.data.DuLieuMau
import vn.edu.uye.datphong.model.LoaiPhong
class DatPhongHelper {
    fum timLoaiPhong(ma: String): LoaiPhong? {
        val maCanTim = ma.trim()
        return DuLieuMau.dsLoaiPhong.find { it.ma.equals(maCanTim, ignoreCase = true)}
    }
}