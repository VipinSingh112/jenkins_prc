/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the AlternateRsoAdd service. Represents a row in the &quot;nbp_hsra_alternate_rso_add&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoAddModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.hsra.application.service.model.impl.AlternateRsoAddImpl"
)
@ProviderType
public interface AlternateRsoAdd extends AlternateRsoAddModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.hsra.application.service.model.impl.AlternateRsoAddImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AlternateRsoAdd, Long>
		ALTERNATE_RSO_ADD_ID_ACCESSOR = new Accessor<AlternateRsoAdd, Long>() {

			@Override
			public Long get(AlternateRsoAdd alternateRsoAdd) {
				return alternateRsoAdd.getAlternateRsoAddId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AlternateRsoAdd> getTypeClass() {
				return AlternateRsoAdd.class;
			}

		};

}