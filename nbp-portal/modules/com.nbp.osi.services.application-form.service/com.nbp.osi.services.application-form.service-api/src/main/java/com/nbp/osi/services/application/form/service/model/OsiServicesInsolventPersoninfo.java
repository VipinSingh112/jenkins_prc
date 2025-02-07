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
 * The extended model interface for the OsiServicesInsolventPersoninfo service. Represents a row in the &quot;nbp_osi_services_inso_per&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesInsolventPersoninfoModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.osi.services.application.form.service.model.impl.OsiServicesInsolventPersoninfoImpl"
)
@ProviderType
public interface OsiServicesInsolventPersoninfo
	extends OsiServicesInsolventPersoninfoModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesInsolventPersoninfoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OsiServicesInsolventPersoninfo, Long>
		OSI_SERVICES_INSO_ID_ACCESSOR =
			new Accessor<OsiServicesInsolventPersoninfo, Long>() {

				@Override
				public Long get(
					OsiServicesInsolventPersoninfo
						osiServicesInsolventPersoninfo) {

					return osiServicesInsolventPersoninfo.
						getOsiServicesInsoId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<OsiServicesInsolventPersoninfo> getTypeClass() {
					return OsiServicesInsolventPersoninfo.class;
				}

			};

}