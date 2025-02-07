/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddInsApplicationInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddInsApplicationInfoLocalService
 * @generated
 */
public class AddInsApplicationInfoLocalServiceWrapper
	implements AddInsApplicationInfoLocalService,
			   ServiceWrapper<AddInsApplicationInfoLocalService> {

	public AddInsApplicationInfoLocalServiceWrapper() {
		this(null);
	}

	public AddInsApplicationInfoLocalServiceWrapper(
		AddInsApplicationInfoLocalService addInsApplicationInfoLocalService) {

		_addInsApplicationInfoLocalService = addInsApplicationInfoLocalService;
	}

	/**
	 * Adds the add ins application info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsApplicationInfo the add ins application info
	 * @return the add ins application info that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
		addAddInsApplicationInfo(
			com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
				addInsApplicationInfo) {

		return _addInsApplicationInfoLocalService.addAddInsApplicationInfo(
			addInsApplicationInfo);
	}

	/**
	 * Creates a new add ins application info with the primary key. Does not add the add ins application info to the database.
	 *
	 * @param addInsApplicationInfoId the primary key for the new add ins application info
	 * @return the new add ins application info
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
		createAddInsApplicationInfo(long addInsApplicationInfoId) {

		return _addInsApplicationInfoLocalService.createAddInsApplicationInfo(
			addInsApplicationInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsApplicationInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add ins application info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsApplicationInfo the add ins application info
	 * @return the add ins application info that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
		deleteAddInsApplicationInfo(
			com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
				addInsApplicationInfo) {

		return _addInsApplicationInfoLocalService.deleteAddInsApplicationInfo(
			addInsApplicationInfo);
	}

	/**
	 * Deletes the add ins application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info that was removed
	 * @throws PortalException if a add ins application info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
			deleteAddInsApplicationInfo(long addInsApplicationInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsApplicationInfoLocalService.deleteAddInsApplicationInfo(
			addInsApplicationInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsApplicationInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addInsApplicationInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addInsApplicationInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addInsApplicationInfoLocalService.dynamicQuery();
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

		return _addInsApplicationInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsApplicationInfoModelImpl</code>.
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

		return _addInsApplicationInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsApplicationInfoModelImpl</code>.
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

		return _addInsApplicationInfoLocalService.dynamicQuery(
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

		return _addInsApplicationInfoLocalService.dynamicQueryCount(
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

		return _addInsApplicationInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
		fetchAddInsApplicationInfo(long addInsApplicationInfoId) {

		return _addInsApplicationInfoLocalService.fetchAddInsApplicationInfo(
			addInsApplicationInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addInsApplicationInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add ins application info with the primary key.
	 *
	 * @param addInsApplicationInfoId the primary key of the add ins application info
	 * @return the add ins application info
	 * @throws PortalException if a add ins application info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
			getAddInsApplicationInfo(long addInsApplicationInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsApplicationInfoLocalService.getAddInsApplicationInfo(
			addInsApplicationInfoId);
	}

	/**
	 * Returns a range of all the add ins application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddInsApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add ins application infos
	 * @param end the upper bound of the range of add ins application infos (not inclusive)
	 * @return the range of add ins application infos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddInsApplicationInfo>
			getAddInsApplicationInfos(int start, int end) {

		return _addInsApplicationInfoLocalService.getAddInsApplicationInfos(
			start, end);
	}

	/**
	 * Returns the number of add ins application infos.
	 *
	 * @return the number of add ins application infos
	 */
	@Override
	public int getAddInsApplicationInfosCount() {
		return _addInsApplicationInfoLocalService.
			getAddInsApplicationInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addInsApplicationInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddInsApplicationInfo>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addInsApplicationInfoLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addInsApplicationInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addInsApplicationInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add ins application info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddInsApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addInsApplicationInfo the add ins application info
	 * @return the add ins application info that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
		updateAddInsApplicationInfo(
			com.nbp.janaac.application.form.service.model.AddInsApplicationInfo
				addInsApplicationInfo) {

		return _addInsApplicationInfoLocalService.updateAddInsApplicationInfo(
			addInsApplicationInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addInsApplicationInfoLocalService.getBasePersistence();
	}

	@Override
	public AddInsApplicationInfoLocalService getWrappedService() {
		return _addInsApplicationInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AddInsApplicationInfoLocalService addInsApplicationInfoLocalService) {

		_addInsApplicationInfoLocalService = addInsApplicationInfoLocalService;
	}

	private AddInsApplicationInfoLocalService
		_addInsApplicationInfoLocalService;

}