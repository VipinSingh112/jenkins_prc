/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultueFarmerLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultueFarmerLocalService
 * @generated
 */
public class AgricultueFarmerLocalServiceWrapper
	implements AgricultueFarmerLocalService,
			   ServiceWrapper<AgricultueFarmerLocalService> {

	public AgricultueFarmerLocalServiceWrapper() {
		this(null);
	}

	public AgricultueFarmerLocalServiceWrapper(
		AgricultueFarmerLocalService agricultueFarmerLocalService) {

		_agricultueFarmerLocalService = agricultueFarmerLocalService;
	}

	/**
	 * Adds the agricultue farmer to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultueFarmerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultueFarmer the agricultue farmer
	 * @return the agricultue farmer that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultueFarmer
		addAgricultueFarmer(
			com.agriculture.application.form.service.model.AgricultueFarmer
				agricultueFarmer) {

		return _agricultueFarmerLocalService.addAgricultueFarmer(
			agricultueFarmer);
	}

	/**
	 * Creates a new agricultue farmer with the primary key. Does not add the agricultue farmer to the database.
	 *
	 * @param agricultueFarmerId the primary key for the new agricultue farmer
	 * @return the new agricultue farmer
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultueFarmer
		createAgricultueFarmer(long agricultueFarmerId) {

		return _agricultueFarmerLocalService.createAgricultueFarmer(
			agricultueFarmerId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultueFarmerLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agricultue farmer from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultueFarmerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultueFarmer the agricultue farmer
	 * @return the agricultue farmer that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultueFarmer
		deleteAgricultueFarmer(
			com.agriculture.application.form.service.model.AgricultueFarmer
				agricultueFarmer) {

		return _agricultueFarmerLocalService.deleteAgricultueFarmer(
			agricultueFarmer);
	}

	/**
	 * Deletes the agricultue farmer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultueFarmerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer that was removed
	 * @throws PortalException if a agricultue farmer with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultueFarmer
			deleteAgricultueFarmer(long agricultueFarmerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultueFarmerLocalService.deleteAgricultueFarmer(
			agricultueFarmerId);
	}

	@Override
	public void deleteAgriFarmById(long applicationId) {
		_agricultueFarmerLocalService.deleteAgriFarmById(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultueFarmerLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultueFarmerLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultueFarmerLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultueFarmerLocalService.dynamicQuery();
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

		return _agricultueFarmerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultueFarmerModelImpl</code>.
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

		return _agricultueFarmerLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultueFarmerModelImpl</code>.
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

		return _agricultueFarmerLocalService.dynamicQuery(
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

		return _agricultueFarmerLocalService.dynamicQueryCount(dynamicQuery);
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

		return _agricultueFarmerLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultueFarmer
		fetchAgricultueFarmer(long agricultueFarmerId) {

		return _agricultueFarmerLocalService.fetchAgricultueFarmer(
			agricultueFarmerId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultueFarmerLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultueFarmer>
			getAF_by_AAI(long agricultureApplicationId) {

		return _agricultueFarmerLocalService.getAF_by_AAI(
			agricultureApplicationId);
	}

	/**
	 * Returns the agricultue farmer with the primary key.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer
	 * @throws PortalException if a agricultue farmer with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultueFarmer
			getAgricultueFarmer(long agricultueFarmerId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultueFarmerLocalService.getAgricultueFarmer(
			agricultueFarmerId);
	}

	/**
	 * Returns a range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @return the range of agricultue farmers
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultueFarmer>
			getAgricultueFarmers(int start, int end) {

		return _agricultueFarmerLocalService.getAgricultueFarmers(start, end);
	}

	/**
	 * Returns the number of agricultue farmers.
	 *
	 * @return the number of agricultue farmers
	 */
	@Override
	public int getAgricultueFarmersCount() {
		return _agricultueFarmerLocalService.getAgricultueFarmersCount();
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultueFarmer
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultueFarmerException {

		return _agricultueFarmerLocalService.getAgricultureById(ApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultueFarmerLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultueFarmerLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultueFarmerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the agricultue farmer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultueFarmerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultueFarmer the agricultue farmer
	 * @return the agricultue farmer that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultueFarmer
		updateAgricultueFarmer(
			com.agriculture.application.form.service.model.AgricultueFarmer
				agricultueFarmer) {

		return _agricultueFarmerLocalService.updateAgricultueFarmer(
			agricultueFarmer);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultueFarmerLocalService.getBasePersistence();
	}

	@Override
	public AgricultueFarmerLocalService getWrappedService() {
		return _agricultueFarmerLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultueFarmerLocalService agricultueFarmerLocalService) {

		_agricultueFarmerLocalService = agricultueFarmerLocalService;
	}

	private AgricultueFarmerLocalService _agricultueFarmerLocalService;

}