/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddFdaAppliInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddFdaAppliInfoLocalService
 * @generated
 */
public class AddFdaAppliInfoLocalServiceWrapper
	implements AddFdaAppliInfoLocalService,
			   ServiceWrapper<AddFdaAppliInfoLocalService> {

	public AddFdaAppliInfoLocalServiceWrapper() {
		this(null);
	}

	public AddFdaAppliInfoLocalServiceWrapper(
		AddFdaAppliInfoLocalService addFdaAppliInfoLocalService) {

		_addFdaAppliInfoLocalService = addFdaAppliInfoLocalService;
	}

	/**
	 * Adds the add fda appli info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaAppliInfo the add fda appli info
	 * @return the add fda appli info that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
		addAddFdaAppliInfo(
			com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
				addFdaAppliInfo) {

		return _addFdaAppliInfoLocalService.addAddFdaAppliInfo(addFdaAppliInfo);
	}

	/**
	 * Creates a new add fda appli info with the primary key. Does not add the add fda appli info to the database.
	 *
	 * @param addFdaAppliInfoId the primary key for the new add fda appli info
	 * @return the new add fda appli info
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
		createAddFdaAppliInfo(long addFdaAppliInfoId) {

		return _addFdaAppliInfoLocalService.createAddFdaAppliInfo(
			addFdaAppliInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaAppliInfoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the add fda appli info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaAppliInfo the add fda appli info
	 * @return the add fda appli info that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
		deleteAddFdaAppliInfo(
			com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
				addFdaAppliInfo) {

		return _addFdaAppliInfoLocalService.deleteAddFdaAppliInfo(
			addFdaAppliInfo);
	}

	/**
	 * Deletes the add fda appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info that was removed
	 * @throws PortalException if a add fda appli info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
			deleteAddFdaAppliInfo(long addFdaAppliInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaAppliInfoLocalService.deleteAddFdaAppliInfo(
			addFdaAppliInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaAppliInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addFdaAppliInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addFdaAppliInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addFdaAppliInfoLocalService.dynamicQuery();
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

		return _addFdaAppliInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaAppliInfoModelImpl</code>.
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

		return _addFdaAppliInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaAppliInfoModelImpl</code>.
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

		return _addFdaAppliInfoLocalService.dynamicQuery(
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

		return _addFdaAppliInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _addFdaAppliInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
		fetchAddFdaAppliInfo(long addFdaAppliInfoId) {

		return _addFdaAppliInfoLocalService.fetchAddFdaAppliInfo(
			addFdaAppliInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addFdaAppliInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add fda appli info with the primary key.
	 *
	 * @param addFdaAppliInfoId the primary key of the add fda appli info
	 * @return the add fda appli info
	 * @throws PortalException if a add fda appli info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
			getAddFdaAppliInfo(long addFdaAppliInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaAppliInfoLocalService.getAddFdaAppliInfo(
			addFdaAppliInfoId);
	}

	/**
	 * Returns a range of all the add fda appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddFdaAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add fda appli infos
	 * @param end the upper bound of the range of add fda appli infos (not inclusive)
	 * @return the range of add fda appli infos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaAppliInfo>
			getAddFdaAppliInfos(int start, int end) {

		return _addFdaAppliInfoLocalService.getAddFdaAppliInfos(start, end);
	}

	/**
	 * Returns the number of add fda appli infos.
	 *
	 * @return the number of add fda appli infos
	 */
	@Override
	public int getAddFdaAppliInfosCount() {
		return _addFdaAppliInfoLocalService.getAddFdaAppliInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addFdaAppliInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddFdaAppliInfo>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addFdaAppliInfoLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addFdaAppliInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addFdaAppliInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the add fda appli info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddFdaAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addFdaAppliInfo the add fda appli info
	 * @return the add fda appli info that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
		updateAddFdaAppliInfo(
			com.nbp.janaac.application.form.service.model.AddFdaAppliInfo
				addFdaAppliInfo) {

		return _addFdaAppliInfoLocalService.updateAddFdaAppliInfo(
			addFdaAppliInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addFdaAppliInfoLocalService.getBasePersistence();
	}

	@Override
	public AddFdaAppliInfoLocalService getWrappedService() {
		return _addFdaAppliInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AddFdaAppliInfoLocalService addFdaAppliInfoLocalService) {

		_addFdaAppliInfoLocalService = addFdaAppliInfoLocalService;
	}

	private AddFdaAppliInfoLocalService _addFdaAppliInfoLocalService;

}