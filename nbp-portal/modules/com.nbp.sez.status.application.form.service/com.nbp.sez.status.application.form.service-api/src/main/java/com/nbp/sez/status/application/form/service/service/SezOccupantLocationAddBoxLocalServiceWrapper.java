/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SezOccupantLocationAddBoxLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantLocationAddBoxLocalService
 * @generated
 */
public class SezOccupantLocationAddBoxLocalServiceWrapper
	implements ServiceWrapper<SezOccupantLocationAddBoxLocalService>,
			   SezOccupantLocationAddBoxLocalService {

	public SezOccupantLocationAddBoxLocalServiceWrapper() {
		this(null);
	}

	public SezOccupantLocationAddBoxLocalServiceWrapper(
		SezOccupantLocationAddBoxLocalService
			sezOccupantLocationAddBoxLocalService) {

		_sezOccupantLocationAddBoxLocalService =
			sezOccupantLocationAddBoxLocalService;
	}

	/**
	 * Adds the sez occupant location add box to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantLocationAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantLocationAddBox the sez occupant location add box
	 * @return the sez occupant location add box that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox addSezOccupantLocationAddBox(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		return _sezOccupantLocationAddBoxLocalService.
			addSezOccupantLocationAddBox(sezOccupantLocationAddBox);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantLocationAddBoxLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez occupant location add box with the primary key. Does not add the sez occupant location add box to the database.
	 *
	 * @param sezOccLocationId the primary key for the new sez occupant location add box
	 * @return the new sez occupant location add box
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox createSezOccupantLocationAddBox(
				long sezOccLocationId) {

		return _sezOccupantLocationAddBoxLocalService.
			createSezOccupantLocationAddBox(sezOccLocationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantLocationAddBoxLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez occupant location add box with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantLocationAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box that was removed
	 * @throws PortalException if a sez occupant location add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox deleteSezOccupantLocationAddBox(
					long sezOccLocationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantLocationAddBoxLocalService.
			deleteSezOccupantLocationAddBox(sezOccLocationId);
	}

	/**
	 * Deletes the sez occupant location add box from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantLocationAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantLocationAddBox the sez occupant location add box
	 * @return the sez occupant location add box that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox deleteSezOccupantLocationAddBox(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		return _sezOccupantLocationAddBoxLocalService.
			deleteSezOccupantLocationAddBox(sezOccupantLocationAddBox);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezOccupantLocationAddBoxLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezOccupantLocationAddBoxLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezOccupantLocationAddBoxLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sezOccupantLocationAddBoxLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _sezOccupantLocationAddBoxLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _sezOccupantLocationAddBoxLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _sezOccupantLocationAddBoxLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _sezOccupantLocationAddBoxLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox fetchSezOccupantLocationAddBox(
				long sezOccLocationId) {

		return _sezOccupantLocationAddBoxLocalService.
			fetchSezOccupantLocationAddBox(sezOccLocationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezOccupantLocationAddBoxLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezOccupantLocationAddBoxLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezOccupantLocationAddBoxLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantLocationAddBoxLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox> getSezLocationBy_Id(
				long sezStatusAppId) {

		return _sezOccupantLocationAddBoxLocalService.getSezLocationBy_Id(
			sezStatusAppId);
	}

	/**
	 * Returns the sez occupant location add box with the primary key.
	 *
	 * @param sezOccLocationId the primary key of the sez occupant location add box
	 * @return the sez occupant location add box
	 * @throws PortalException if a sez occupant location add box with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox getSezOccupantLocationAddBox(
					long sezOccLocationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _sezOccupantLocationAddBoxLocalService.
			getSezOccupantLocationAddBox(sezOccLocationId);
	}

	/**
	 * Returns a range of all the sez occupant location add boxes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantLocationAddBoxModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant location add boxes
	 * @param end the upper bound of the range of sez occupant location add boxes (not inclusive)
	 * @return the range of sez occupant location add boxes
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox> getSezOccupantLocationAddBoxes(
				int start, int end) {

		return _sezOccupantLocationAddBoxLocalService.
			getSezOccupantLocationAddBoxes(start, end);
	}

	/**
	 * Returns the number of sez occupant location add boxes.
	 *
	 * @return the number of sez occupant location add boxes
	 */
	@Override
	public int getSezOccupantLocationAddBoxesCount() {
		return _sezOccupantLocationAddBoxLocalService.
			getSezOccupantLocationAddBoxesCount();
	}

	/**
	 * Updates the sez occupant location add box in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantLocationAddBoxLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantLocationAddBox the sez occupant location add box
	 * @return the sez occupant location add box that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.
			SezOccupantLocationAddBox updateSezOccupantLocationAddBox(
				com.nbp.sez.status.application.form.service.model.
					SezOccupantLocationAddBox sezOccupantLocationAddBox) {

		return _sezOccupantLocationAddBoxLocalService.
			updateSezOccupantLocationAddBox(sezOccupantLocationAddBox);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _sezOccupantLocationAddBoxLocalService.getBasePersistence();
	}

	@Override
	public SezOccupantLocationAddBoxLocalService getWrappedService() {
		return _sezOccupantLocationAddBoxLocalService;
	}

	@Override
	public void setWrappedService(
		SezOccupantLocationAddBoxLocalService
			sezOccupantLocationAddBoxLocalService) {

		_sezOccupantLocationAddBoxLocalService =
			sezOccupantLocationAddBoxLocalService;
	}

	private SezOccupantLocationAddBoxLocalService
		_sezOccupantLocationAddBoxLocalService;

}