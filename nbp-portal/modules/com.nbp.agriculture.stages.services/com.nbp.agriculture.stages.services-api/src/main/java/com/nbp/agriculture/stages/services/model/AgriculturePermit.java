/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AgriculturePermit service. Represents a row in the &quot;nbp_agriculture_permit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePermitModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.agriculture.stages.services.model.impl.AgriculturePermitImpl"
)
@ProviderType
public interface AgriculturePermit
	extends AgriculturePermitModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.agriculture.stages.services.model.impl.AgriculturePermitImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AgriculturePermit, Long>
		AGRICULTURE_PERMIT_ID_ACCESSOR =
			new Accessor<AgriculturePermit, Long>() {

				@Override
				public Long get(AgriculturePermit agriculturePermit) {
					return agriculturePermit.getAgriculturePermitId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<AgriculturePermit> getTypeClass() {
					return AgriculturePermit.class;
				}

			};

}