package hbi.core.handchina.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import hbi.core.handchina.dto.Wer;
import hbi.core.handchina.service.IWerService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class WerServiceImpl extends BaseServiceImpl<Wer> implements IWerService{

}