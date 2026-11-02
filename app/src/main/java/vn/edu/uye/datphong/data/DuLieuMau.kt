package vn.edu.uye.datphong.data
import vn.edu.uye.datphong.model.LoaiPhong
object DuLieuMau {
    val dsLoaiPhong: List<LoaiPhong> = listOf(
        LoaiPhong("P123","Phòng VIP", 1500000,1),
        LoaiPhong("P456","Phòng thường", 1000000,2),
        LoaiPhong("P789","Phòng đôi", 2000000,4)
    )
}