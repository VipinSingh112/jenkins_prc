/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JanaacReport service. Represents a row in the &quot;nbp_janaac_report&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacReportModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.janaac.stages.services.model.impl.JanaacReportImpl"
)
@ProviderType
public interface JanaacReport extends JanaacReportModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.janaac.stages.services.model.impl.JanaacReportImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JanaacReport, Long> JANAAC_REPORT_ID_ACCESSOR =
		new Accessor<JanaacReport, Long>() {

			@Override
			public Long get(JanaacReport janaacReport) {
				return janaacReport.getJanaacReportId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<JanaacReport> getTypeClass() {
				return JanaacReport.class;
			}

		};

}