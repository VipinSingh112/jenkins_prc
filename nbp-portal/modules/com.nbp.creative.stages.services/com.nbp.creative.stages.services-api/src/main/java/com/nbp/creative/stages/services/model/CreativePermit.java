/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CreativePermit service. Represents a row in the &quot;nbp_creative_permit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CreativePermitModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.creative.stages.services.model.impl.CreativePermitImpl"
)
@ProviderType
public interface CreativePermit extends CreativePermitModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.creative.stages.services.model.impl.CreativePermitImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CreativePermit, Long>
		CREATIVE_PERMIT_ID_ACCESSOR = new Accessor<CreativePermit, Long>() {

			@Override
			public Long get(CreativePermit creativePermit) {
				return creativePermit.getCreativePermitId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<CreativePermit> getTypeClass() {
				return CreativePermit.class;
			}

		};

}