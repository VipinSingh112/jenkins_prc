/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.model.impl;

import com.nbp.osi.services.stages.service.model.OsiServiceIssuanceOfReport;
import com.nbp.osi.services.stages.service.service.OsiServiceIssuanceOfReportLocalServiceUtil;

/**
 * The extended model base implementation for the OsiServiceIssuanceOfReport service. Represents a row in the &quot;nbp_osi_service_report&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OsiServiceIssuanceOfReportImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServiceIssuanceOfReportImpl
 * @see OsiServiceIssuanceOfReport
 * @generated
 */
public abstract class OsiServiceIssuanceOfReportBaseImpl
	extends OsiServiceIssuanceOfReportModelImpl
	implements OsiServiceIssuanceOfReport {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a osi service issuance of report model instance should use the <code>OsiServiceIssuanceOfReport</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			OsiServiceIssuanceOfReportLocalServiceUtil.
				addOsiServiceIssuanceOfReport(this);
		}
		else {
			OsiServiceIssuanceOfReportLocalServiceUtil.
				updateOsiServiceIssuanceOfReport(this);
		}
	}

}