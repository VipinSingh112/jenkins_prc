/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddCerApplicationInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddCerApplicationInfoLocalService
 * @generated
 */
public class AddCerApplicationInfoLocalServiceWrapper
	implements AddCerApplicationInfoLocalService,
			   ServiceWrapper<AddCerApplicationInfoLocalService> {

	public AddCerApplicationInfoLocalServiceWrapper() {
		this(null);
	}

	public AddCerApplicationInfoLocalServiceWrapper(
		AddCerApplicationInfoLocalService addCerApplicationInfoLocalService) {

		_addCerApplicationInfoLocalService = addCerApplicationInfoLocalService;
	}

	/**
	 * Adds the add cer application info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerApplicationInfo the add cer application info
	 * @return the add cer application info that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
		addAddCerApplicationInfo(
			com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
				addCerApplicationInfo) {

		return _addCerApplicationInfoLocalService.addAddCerApplicationInfo(
			addCerApplicationInfo);
	}

	/**
	 * Creates a new add cer application info with the primary key. Does not add the add cer application info to the database.
	 *
	 * @param addCerApplicationInfoId the primary key for the new add cer application info
	 * @return the new add cer application info
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
		createAddCerApplicationInfo(long addCerApplicationInfoId) {

		return _addCerApplicationInfoLocalService.createAddCerApplicationInfo(
			addCerApplicationInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerApplicationInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add cer application info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerApplicationInfo the add cer application info
	 * @return the add cer application info that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
		deleteAddCerApplicationInfo(
			com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
				addCerApplicationInfo) {

		return _addCerApplicationInfoLocalService.deleteAddCerApplicationInfo(
			addCerApplicationInfo);
	}

	/**
	 * Deletes the add cer application info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerApplicationInfoId the primary key of the add cer application info
	 * @return the add cer application info that was removed
	 * @throws PortalException if a add cer application info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
			deleteAddCerApplicationInfo(long addCerApplicationInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerApplicationInfoLocalService.deleteAddCerApplicationInfo(
			addCerApplicationInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerApplicationInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addCerApplicationInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addCerApplicationInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addCerApplicationInfoLocalService.dynamicQuery();
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

		return _addCerApplicationInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerApplicationInfoModelImpl</code>.
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

		return _addCerApplicationInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerApplicationInfoModelImpl</code>.
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

		return _addCerApplicationInfoLocalService.dynamicQuery(
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

		return _addCerApplicationInfoLocalService.dynamicQueryCount(
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

		return _addCerApplicationInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
		fetchAddCerApplicationInfo(long addCerApplicationInfoId) {

		return _addCerApplicationInfoLocalService.fetchAddCerApplicationInfo(
			addCerApplicationInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addCerApplicationInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add cer application info with the primary key.
	 *
	 * @param addCerApplicationInfoId the primary key of the add cer application info
	 * @return the add cer application info
	 * @throws PortalException if a add cer application info with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
			getAddCerApplicationInfo(long addCerApplicationInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerApplicationInfoLocalService.getAddCerApplicationInfo(
			addCerApplicationInfoId);
	}

	/**
	 * Returns a range of all the add cer application infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddCerApplicationInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add cer application infos
	 * @param end the upper bound of the range of add cer application infos (not inclusive)
	 * @return the range of add cer application infos
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerApplicationInfo>
			getAddCerApplicationInfos(int start, int end) {

		return _addCerApplicationInfoLocalService.getAddCerApplicationInfos(
			start, end);
	}

	/**
	 * Returns the number of add cer application infos.
	 *
	 * @return the number of add cer application infos
	 */
	@Override
	public int getAddCerApplicationInfosCount() {
		return _addCerApplicationInfoLocalService.
			getAddCerApplicationInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addCerApplicationInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddCerApplicationInfo>
			getJANAAC_ByApplicationId(long janaacApplicationId) {

		return _addCerApplicationInfoLocalService.getJANAAC_ByApplicationId(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addCerApplicationInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addCerApplicationInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add cer application info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddCerApplicationInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addCerApplicationInfo the add cer application info
	 * @return the add cer application info that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
		updateAddCerApplicationInfo(
			com.nbp.janaac.application.form.service.model.AddCerApplicationInfo
				addCerApplicationInfo) {

		return _addCerApplicationInfoLocalService.updateAddCerApplicationInfo(
			addCerApplicationInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addCerApplicationInfoLocalService.getBasePersistence();
	}

	@Override
	public AddCerApplicationInfoLocalService getWrappedService() {
		return _addCerApplicationInfoLocalService;
	}

	@Override
	public void setWrappedService(
		AddCerApplicationInfoLocalService addCerApplicationInfoLocalService) {

		_addCerApplicationInfoLocalService = addCerApplicationInfoLocalService;
	}

	private AddCerApplicationInfoLocalService
		_addCerApplicationInfoLocalService;

}