/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the JadscAppliPreliminationDete service. Represents a row in the &quot;nbp_jadsc_appli_preli_deter&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliPreliminationDeteModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteImpl"
)
@ProviderType
public interface JadscAppliPreliminationDete
	extends JadscAppliPreliminationDeteModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliPreliminationDeteImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JadscAppliPreliminationDete, Long>
		JADSC_APPLI_PRELIMINATION_DETE_ID_ACCESSOR =
			new Accessor<JadscAppliPreliminationDete, Long>() {

				@Override
				public Long get(
					JadscAppliPreliminationDete jadscAppliPreliminationDete) {

					return jadscAppliPreliminationDete.
						getJadscAppliPreliminationDeteId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<JadscAppliPreliminationDete> getTypeClass() {
					return JadscAppliPreliminationDete.class;
				}

			};

}