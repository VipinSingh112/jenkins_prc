/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AgricultureOrnamentalLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureOrnamentalLocalService
 * @generated
 */
public class AgricultureOrnamentalLocalServiceWrapper
	implements AgricultureOrnamentalLocalService,
			   ServiceWrapper<AgricultureOrnamentalLocalService> {

	public AgricultureOrnamentalLocalServiceWrapper() {
		this(null);
	}

	public AgricultureOrnamentalLocalServiceWrapper(
		AgricultureOrnamentalLocalService agricultureOrnamentalLocalService) {

		_agricultureOrnamentalLocalService = agricultureOrnamentalLocalService;
	}

	/**
	 * Adds the agriculture ornamental to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureOrnamentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureOrnamental the agriculture ornamental
	 * @return the agriculture ornamental that was added
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureOrnamental
		addAgricultureOrnamental(
			com.agriculture.application.form.service.model.AgricultureOrnamental
				agricultureOrnamental) {

		return _agricultureOrnamentalLocalService.addAgricultureOrnamental(
			agricultureOrnamental);
	}

	/**
	 * Creates a new agriculture ornamental with the primary key. Does not add the agriculture ornamental to the database.
	 *
	 * @param agricultureOrnamentalId the primary key for the new agriculture ornamental
	 * @return the new agriculture ornamental
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureOrnamental
		createAgricultureOrnamental(long agricultureOrnamentalId) {

		return _agricultureOrnamentalLocalService.createAgricultureOrnamental(
			agricultureOrnamentalId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureOrnamentalLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the agriculture ornamental from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureOrnamentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureOrnamental the agriculture ornamental
	 * @return the agriculture ornamental that was removed
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureOrnamental
		deleteAgricultureOrnamental(
			com.agriculture.application.form.service.model.AgricultureOrnamental
				agricultureOrnamental) {

		return _agricultureOrnamentalLocalService.deleteAgricultureOrnamental(
			agricultureOrnamental);
	}

	/**
	 * Deletes the agriculture ornamental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureOrnamentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental that was removed
	 * @throws PortalException if a agriculture ornamental with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureOrnamental
			deleteAgricultureOrnamental(long agricultureOrnamentalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureOrnamentalLocalService.deleteAgricultureOrnamental(
			agricultureOrnamentalId);
	}

	@Override
	public void deleteAgriOrnamentalById(long applicationId) {
		_agricultureOrnamentalLocalService.deleteAgriOrnamentalById(
			applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureOrnamentalLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _agricultureOrnamentalLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _agricultureOrnamentalLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _agricultureOrnamentalLocalService.dynamicQuery();
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

		return _agricultureOrnamentalLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureOrnamentalModelImpl</code>.
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

		return _agricultureOrnamentalLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureOrnamentalModelImpl</code>.
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

		return _agricultureOrnamentalLocalService.dynamicQuery(
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

		return _agricultureOrnamentalLocalService.dynamicQueryCount(
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

		return _agricultureOrnamentalLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureOrnamental
		fetchAgricultureOrnamental(long agricultureOrnamentalId) {

		return _agricultureOrnamentalLocalService.fetchAgricultureOrnamental(
			agricultureOrnamentalId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _agricultureOrnamentalLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.agriculture.application.form.service.model.AgricultureOrnamental
			getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgricultureOrnamentalException {

		return _agricultureOrnamentalLocalService.getAgricultureById(
			ApplicationId);
	}

	/**
	 * Returns the agriculture ornamental with the primary key.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental
	 * @throws PortalException if a agriculture ornamental with the primary key could not be found
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureOrnamental
			getAgricultureOrnamental(long agricultureOrnamentalId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureOrnamentalLocalService.getAgricultureOrnamental(
			agricultureOrnamentalId);
	}

	/**
	 * Returns a range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @return the range of agriculture ornamentals
	 */
	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureOrnamental>
			getAgricultureOrnamentals(int start, int end) {

		return _agricultureOrnamentalLocalService.getAgricultureOrnamentals(
			start, end);
	}

	/**
	 * Returns the number of agriculture ornamentals.
	 *
	 * @return the number of agriculture ornamentals
	 */
	@Override
	public int getAgricultureOrnamentalsCount() {
		return _agricultureOrnamentalLocalService.
			getAgricultureOrnamentalsCount();
	}

	@Override
	public java.util.List
		<com.agriculture.application.form.service.model.AgricultureOrnamental>
			getAO_by_AAI(long agricultureApplicationId) {

		return _agricultureOrnamentalLocalService.getAO_by_AAI(
			agricultureApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _agricultureOrnamentalLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _agricultureOrnamentalLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _agricultureOrnamentalLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the agriculture ornamental in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureOrnamentalLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureOrnamental the agriculture ornamental
	 * @return the agriculture ornamental that was updated
	 */
	@Override
	public com.agriculture.application.form.service.model.AgricultureOrnamental
		updateAgricultureOrnamental(
			com.agriculture.application.form.service.model.AgricultureOrnamental
				agricultureOrnamental) {

		return _agricultureOrnamentalLocalService.updateAgricultureOrnamental(
			agricultureOrnamental);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _agricultureOrnamentalLocalService.getBasePersistence();
	}

	@Override
	public AgricultureOrnamentalLocalService getWrappedService() {
		return _agricultureOrnamentalLocalService;
	}

	@Override
	public void setWrappedService(
		AgricultureOrnamentalLocalService agricultureOrnamentalLocalService) {

		_agricultureOrnamentalLocalService = agricultureOrnamentalLocalService;
	}

	private AgricultureOrnamentalLocalService
		_agricultureOrnamentalLocalService;

}