/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuEquipmentLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentLocalService
 * @generated
 */
public class ManuEquipmentLocalServiceWrapper
	implements ManuEquipmentLocalService,
			   ServiceWrapper<ManuEquipmentLocalService> {

	public ManuEquipmentLocalServiceWrapper() {
		this(null);
	}

	public ManuEquipmentLocalServiceWrapper(
		ManuEquipmentLocalService manuEquipmentLocalService) {

		_manuEquipmentLocalService = manuEquipmentLocalService;
	}

	/**
	 * Adds the manu equipment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuEquipmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuEquipment the manu equipment
	 * @return the manu equipment that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipment
		addManuEquipment(
			com.nbp.manufacturing.application.form.service.model.ManuEquipment
				manuEquipment) {

		return _manuEquipmentLocalService.addManuEquipment(manuEquipment);
	}

	/**
	 * Creates a new manu equipment with the primary key. Does not add the manu equipment to the database.
	 *
	 * @param manuEquipmentId the primary key for the new manu equipment
	 * @return the new manu equipment
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipment
		createManuEquipment(long manuEquipmentId) {

		return _manuEquipmentLocalService.createManuEquipment(manuEquipmentId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the manu equipment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuEquipmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment that was removed
	 * @throws PortalException if a manu equipment with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipment
			deleteManuEquipment(long manuEquipmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentLocalService.deleteManuEquipment(manuEquipmentId);
	}

	/**
	 * Deletes the manu equipment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuEquipmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuEquipment the manu equipment
	 * @return the manu equipment that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipment
		deleteManuEquipment(
			com.nbp.manufacturing.application.form.service.model.ManuEquipment
				manuEquipment) {

		return _manuEquipmentLocalService.deleteManuEquipment(manuEquipment);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuEquipmentLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuEquipmentLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuEquipmentLocalService.dynamicQuery();
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

		return _manuEquipmentLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentModelImpl</code>.
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

		return _manuEquipmentLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentModelImpl</code>.
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

		return _manuEquipmentLocalService.dynamicQuery(
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

		return _manuEquipmentLocalService.dynamicQueryCount(dynamicQuery);
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

		return _manuEquipmentLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipment
		fetchManuEquipment(long manuEquipmentId) {

		return _manuEquipmentLocalService.fetchManuEquipment(manuEquipmentId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuEquipmentLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuEquipmentLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ManuEquipment>
			getMA_ME_MAI(long applicationId) {

		return _manuEquipmentLocalService.getMA_ME_MAI(applicationId);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipment
		getManuById(long applicationId) {

		return _manuEquipmentLocalService.getManuById(applicationId);
	}

	/**
	 * Returns the manu equipment with the primary key.
	 *
	 * @param manuEquipmentId the primary key of the manu equipment
	 * @return the manu equipment
	 * @throws PortalException if a manu equipment with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipment
			getManuEquipment(long manuEquipmentId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentLocalService.getManuEquipment(manuEquipmentId);
	}

	/**
	 * Returns a range of all the manu equipments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipments
	 * @param end the upper bound of the range of manu equipments (not inclusive)
	 * @return the range of manu equipments
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ManuEquipment>
			getManuEquipments(int start, int end) {

		return _manuEquipmentLocalService.getManuEquipments(start, end);
	}

	/**
	 * Returns the number of manu equipments.
	 *
	 * @return the number of manu equipments
	 */
	@Override
	public int getManuEquipmentsCount() {
		return _manuEquipmentLocalService.getManuEquipmentsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuEquipmentLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the manu equipment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuEquipmentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuEquipment the manu equipment
	 * @return the manu equipment that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipment
		updateManuEquipment(
			com.nbp.manufacturing.application.form.service.model.ManuEquipment
				manuEquipment) {

		return _manuEquipmentLocalService.updateManuEquipment(manuEquipment);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuEquipmentLocalService.getBasePersistence();
	}

	@Override
	public ManuEquipmentLocalService getWrappedService() {
		return _manuEquipmentLocalService;
	}

	@Override
	public void setWrappedService(
		ManuEquipmentLocalService manuEquipmentLocalService) {

		_manuEquipmentLocalService = manuEquipmentLocalService;
	}

	private ManuEquipmentLocalService _manuEquipmentLocalService;

}