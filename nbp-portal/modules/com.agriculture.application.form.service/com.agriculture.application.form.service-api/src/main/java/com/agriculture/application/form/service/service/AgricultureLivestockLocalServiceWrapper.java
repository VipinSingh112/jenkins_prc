/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureLivestockLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureLivestockLocalService
 * @generated
 */
public class AgricultureLivestockLocalServiceWrapper
	implements AgricultureLivestockLocalService,
			   ServiceWrapper<AgricultureLivestockLocalService> {

	public AgricultureLivestockLocalServiceWrapper() {
		this(null);
	}

	public AgricultureLivestockLocalServiceWrapper(
		AgricultureLivestockLocalService agricultureLivestockLocalService) {

		_agricultureLivestockLocalService = agricultureLivestockLocalService;
	}

	/**
	 * Adds the agriculture livestock to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureLivestock the agriculture livestock
	 * @return the agriculture livestock that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureLivestock
		addAgricultureLivestock(
			com.agriculture.application.form.service.model.AgricultureLivestock
				agricultureLivestock) {

		return _agricultureLivestockLocalService.addAgricultureLivestock(
			agricultureLivestock);
	}

	/**
	 * Creates a new agriculture livestock with the primary key. Does not add the agriculture livestock to the database.
	 *
	 * @param agricultureLivestockId the primary key for the new agriculture livestock
	 * @return the new agriculture livestock
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureLivestock
		createAgricultureLivestock(long agricultureLivestockId) {

		return _agricultureLivestockLocalService.createAgricultureLivestock(
			agricultureLivestockId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureLivestockLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agriculture livestock from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureLivestock the agriculture livestock
	 * @return the agriculture livestock that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureLivestock
		deleteAgricultureLivestock(
			com.agriculture.application.form.service.model.AgricultureLivestock
				agricultureLivestock) {

		return _agricultureLivestockLocalService.deleteAgricultureLivestock(
			agricultureLivestock);
	}

	/**
	 * Deletes the agriculture livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock that was removed
	 * @throws PortalException if a agriculture livestock with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureLivestock
			deleteAgricultureLivestock(long agricultureLivestockId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureLivestockLocalService.deleteAgricultureLivestock(
			agricultureLivestockId);
	}

	@Override
	public void deleteAgriLivestockById(long applicationId) {
		_agricultureLivestockLocalService.deleteAgriLivestockById(
			applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureLivestockLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureLivestockLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureLivestockLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureLivestockLocalService.dynamicQuery();
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

		return _agricultureLivestockLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureLivestockModelImpl</code>.
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

		return _agricultureLivestockLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureLivestockModelImpl</code>.
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

		return _agricultureLivestockLocalService.dynamicQuery(
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

		return _agricultureLivestockLocalService.dynamicQueryCount(
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

		return _agricultureLivestockLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureLivestock
		fetchAgricultureLivestock(long agricultureLivestockId) {

		return _agricultureLivestockLocalService.fetchAgricultureLivestock(
			agricultureLivestockId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureLivestockLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureLivestock
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureLivestockException {

		return _agricultureLivestockLocalService.getAgricultureById(
			ApplicationId);
	}

	/**
	 * Returns the agriculture livestock with the primary key.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock
	 * @throws PortalException if a agriculture livestock with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureLivestock
			getAgricultureLivestock(long agricultureLivestockId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureLivestockLocalService.getAgricultureLivestock(
			agricultureLivestockId);
	}

	/**
	 * Returns a range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @return the range of agriculture livestocks
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureLivestock>
			getAgricultureLivestocks(int start, int end) {

		return _agricultureLivestockLocalService.getAgricultureLivestocks(
			start, end);
	}

	/**
	 * Returns the number of agriculture livestocks.
	 *
	 * @return the number of agriculture livestocks
	 */
	@Override
	public int getAgricultureLivestocksCount() {
		return _agricultureLivestockLocalService.
			getAgricultureLivestocksCount();
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureLivestock>
			getAL_by_AAI(long agricultureApplicationId) {

		return _agricultureLivestockLocalService.getAL_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureLivestockLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureLivestockLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureLivestockLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agriculture livestock in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureLivestockLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureLivestock the agriculture livestock
	 * @return the agriculture livestock that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureLivestock
		updateAgricultureLivestock(
			com.agriculture.application.form.service.model.AgricultureLivestock
				agricultureLivestock) {

		return _agricultureLivestockLocalService.updateAgricultureLivestock(
			agricultureLivestock);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureLivestockLocalService.getBasePersistence();
	}

	@Override
	public AgricultureLivestockLocalService getWrappedService() {
		return _agricultureLivestockLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureLivestockLocalService agricultureLivestockLocalService) {

		_agricultureLivestockLocalService = agricultureLivestockLocalService;
	}

	private AgricultureLivestockLocalService _agricultureLivestockLocalService;

}