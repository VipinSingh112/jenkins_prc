/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.collaboration.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the CannabisCollobartion service. Represents a row in the &quot;nbp_cannabis_collaboration&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisCollobartionModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionImpl"
)
@ProviderType
public interface CannabisCollobartion
	extends CannabisCollobartionModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.cannabis.collaboration.services.model.impl.CannabisCollobartionImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<CannabisCollobartion, Long>
		CANNABIS_COLLABORATION_ID_ACCESSOR =
			new Accessor<CannabisCollobartion, Long>() {

				@Override
				public Long get(CannabisCollobartion cannabisCollobartion) {
					return cannabisCollobartion.getCannabisCollaborationId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<CannabisCollobartion> getTypeClass() {
					return CannabisCollobartion.class;
				}

			};

}