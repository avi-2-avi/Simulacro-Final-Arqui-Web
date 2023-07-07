package vidal.falcon.ef.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class VfDTODirectorSummary {
    private String vfFullName;
    private Integer vfCountShorts;
    private Integer vfCountFilms;
    private Date vfDateAffiliation;
    private Double vfTotalSales;
}
