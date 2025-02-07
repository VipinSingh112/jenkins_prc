/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the FilmEquipmentList service. Represents a row in the &quot;nbp_film_equipment_list&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FilmEquipmentListModel
 * @generated
 */
@ImplementationClassName(
	"com.nbp.film.application.form.service.model.impl.FilmEquipmentListImpl"
)
@ProviderType
public interface FilmEquipmentList
	extends FilmEquipmentListModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.nbp.film.application.form.service.model.impl.FilmEquipmentListImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<FilmEquipmentList, Long>
		FILM_EQUIPMENT_LIST_ID_ACCESSOR =
			new Accessor<FilmEquipmentList, Long>() {

				@Override
				public Long get(FilmEquipmentList filmEquipmentList) {
					return filmEquipmentList.getFilmEquipmentListId();
				}

				@Override
				public Class<Long> getAttributeClass() {
					return Long.class;
				}

				@Override
				public Class<FilmEquipmentList> getTypeClass() {
					return FilmEquipmentList.class;
				}

			};

}