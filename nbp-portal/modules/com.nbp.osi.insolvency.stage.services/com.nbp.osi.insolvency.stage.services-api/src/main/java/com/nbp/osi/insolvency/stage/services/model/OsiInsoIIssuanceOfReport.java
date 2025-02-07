/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OsiInsoIIssuanceOfReport service. Represents a row in the &quot;nbp_osi_insol_issu_of_report&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsoIIssuanceOfReportModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportImpl"
)
@ProviderType
public interface OsiInsoIIssuanceOfReport
	extends OsiInsoIIssuanceOfReportModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsoIIssuanceOfReportImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiInsoIIssuanceOfReport, Long>
		OSI_INSO_I_ISSUANCE_OF_REPORT_ID_ACCESSOR =
			new Accessor<OsiInsoIIssuanceOfReport, Long>() {

				@Override
				public Long get(
					OsiInsoIIssuanceOfReport osiInsoIIssuanceOfReport) {

					return osiInsoIIssuanceOfReport.
						getOsiInsoIIssuanceOfReportId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OsiInsoIIssuanceOfReport> getTypeClass() {
					return OsiInsoIIssuanceOfReport.class;
				}

			};

}