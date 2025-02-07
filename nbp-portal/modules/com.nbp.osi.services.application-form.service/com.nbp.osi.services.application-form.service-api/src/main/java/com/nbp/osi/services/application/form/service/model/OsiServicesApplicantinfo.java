/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the OsiServicesApplicantinfo service. Represents a row in the &quot;nbp_osi_services_appli_info&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicantinfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoImpl"
)
@ProviderType
public interface OsiServicesApplicantinfo
	extends OsiServicesApplicantinfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicantinfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiServicesApplicantinfo, Long>
		OSI_SERVICES_APPLICAN_ID_ACCESSOR =
			new Accessor<OsiServicesApplicantinfo, Long>() {

				@Override
				public Long get(
					OsiServicesApplicantinfo osiServicesApplicantinfo) {

					return osiServicesApplicantinfo.getOsiServicesApplicanId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OsiServicesApplicantinfo> getTypeClass() {
					return OsiServicesApplicantinfo.class;
				}

			};

}