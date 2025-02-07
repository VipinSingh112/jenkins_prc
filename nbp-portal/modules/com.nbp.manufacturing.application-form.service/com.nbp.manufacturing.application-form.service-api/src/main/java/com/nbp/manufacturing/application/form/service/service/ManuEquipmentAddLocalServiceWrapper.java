/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ManuEquipmentAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuEquipmentAddLocalService
 * @generated
 */
public class ManuEquipmentAddLocalServiceWrapper
	implements ManuEquipmentAddLocalService,
			   ServiceWrapper<ManuEquipmentAddLocalService> {

	public ManuEquipmentAddLocalServiceWrapper() {
		this(null);
	}

	public ManuEquipmentAddLocalServiceWrapper(
		ManuEquipmentAddLocalService manuEquipmentAddLocalService) {

		_manuEquipmentAddLocalService = manuEquipmentAddLocalService;
	}

	/**
	 * Adds the manu equipment add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuEquipmentAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuEquipmentAdd the manu equipment add
	 * @return the manu equipment add that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd
		addManuEquipmentAdd(
			com.nbp.manufacturing.application.form.service.model.
				ManuEquipmentAdd manuEquipmentAdd) {

		return _manuEquipmentAddLocalService.addManuEquipmentAdd(
			manuEquipmentAdd);
	}

	/**
	 * Creates a new manu equipment add with the primary key. Does not add the manu equipment add to the database.
	 *
	 * @param manuEquipmentAddId the primary key for the new manu equipment add
	 * @return the new manu equipment add
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd
		createManuEquipmentAdd(long manuEquipmentAddId) {

		return _manuEquipmentAddLocalService.createManuEquipmentAdd(
			manuEquipmentAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manu equipment add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuEquipmentAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add that was removed
	 * @throws PortalException if a manu equipment add with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd
			deleteManuEquipmentAdd(long manuEquipmentAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentAddLocalService.deleteManuEquipmentAdd(
			manuEquipmentAddId);
	}

	/**
	 * Deletes the manu equipment add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuEquipmentAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuEquipmentAdd the manu equipment add
	 * @return the manu equipment add that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd
		deleteManuEquipmentAdd(
			com.nbp.manufacturing.application.form.service.model.
				ManuEquipmentAdd manuEquipmentAdd) {

		return _manuEquipmentAddLocalService.deleteManuEquipmentAdd(
			manuEquipmentAdd);
	}

	@Override
	public void deleteMultipleFormBy_id(long applicationId) {
		_manuEquipmentAddLocalService.deleteMultipleFormBy_id(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuEquipmentAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuEquipmentAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuEquipmentAddLocalService.dynamicQuery();
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

		return _manuEquipmentAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentAddModelImpl</code>.
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

		return _manuEquipmentAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentAddModelImpl</code>.
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

		return _manuEquipmentAddLocalService.dynamicQuery(
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

		return _manuEquipmentAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _manuEquipmentAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd
		fetchManuEquipmentAdd(long manuEquipmentAddId) {

		return _manuEquipmentAddLocalService.fetchManuEquipmentAdd(
			manuEquipmentAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuEquipmentAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuEquipmentAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd>
			getMA_EAF(long manufacturingApplicationId) {

		return _manuEquipmentAddLocalService.getMA_EAF(
			manufacturingApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd>
			getMA_EAI(long manuEquipmentId) {

		return _manuEquipmentAddLocalService.getMA_EAI(manuEquipmentId);
	}

	/**
	 * Returns the manu equipment add with the primary key.
	 *
	 * @param manuEquipmentAddId the primary key of the manu equipment add
	 * @return the manu equipment add
	 * @throws PortalException if a manu equipment add with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd
			getManuEquipmentAdd(long manuEquipmentAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentAddLocalService.getManuEquipmentAdd(
			manuEquipmentAddId);
	}

	/**
	 * Returns a range of all the manu equipment adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuEquipmentAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu equipment adds
	 * @param end the upper bound of the range of manu equipment adds (not inclusive)
	 * @return the range of manu equipment adds
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd>
			getManuEquipmentAdds(int start, int end) {

		return _manuEquipmentAddLocalService.getManuEquipmentAdds(start, end);
	}

	/**
	 * Returns the number of manu equipment adds.
	 *
	 * @return the number of manu equipment adds
	 */
	@Override
	public int getManuEquipmentAddsCount() {
		return _manuEquipmentAddLocalService.getManuEquipmentAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuEquipmentAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuEquipmentAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the manu equipment add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuEquipmentAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuEquipmentAdd the manu equipment add
	 * @return the manu equipment add that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.ManuEquipmentAdd
		updateManuEquipmentAdd(
			com.nbp.manufacturing.application.form.service.model.
				ManuEquipmentAdd manuEquipmentAdd) {

		return _manuEquipmentAddLocalService.updateManuEquipmentAdd(
			manuEquipmentAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _manuEquipmentAddLocalService.getBasePersistence();
	}

	@Override
	public ManuEquipmentAddLocalService getWrappedService() {
		return _manuEquipmentAddLocalService;
	}

	@Override
	public void setWrappedService(
		ManuEquipmentAddLocalService manuEquipmentAddLocalService) {

		_manuEquipmentAddLocalService = manuEquipmentAddLocalService;
	}

	private ManuEquipmentAddLocalService _manuEquipmentAddLocalService;

}