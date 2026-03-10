package service;

import entity.XeTuanTraMatTrang;
import repository.IXeTuanTraRepository;
import repository.XeTuanTraRepository;

import java.util.List;

public class XeTuanTraMatTrangService implements IXeTuanTraService{
    private IXeTuanTraRepository xeTuanTraRepository = new XeTuanTraRepository();
    @Override
    public List<XeTuanTraMatTrang> findAll() {
        return xeTuanTraRepository.findAll();
    }

    @Override
    public List<XeTuanTraMatTrang> search(String soHieu, String nguoiDieuPhoi) {
        return xeTuanTraRepository.findAll();
    }

    @Override
    public void add(XeTuanTraMatTrang xeTuanTraMatTrang) {
         xeTuanTraRepository.add(xeTuanTraMatTrang);
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
