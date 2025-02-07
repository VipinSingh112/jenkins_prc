/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FitPropFinancialProfileLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropFinancialProfileLocalService
 * @generated
 */
public class FitPropFinancialProfileLocalServiceWrapper
	implements FitPropFinancialProfileLocalService,
			   ServiceWrapper<FitPropFinancialProfileLocalService> {

	public FitPropFinancialProfileLocalServiceWrapper() {
		this(null);
	}

	public FitPropFinancialProfileLocalServiceWrapper(
		FitPropFinancialProfileLocalService
			fitPropFinancialProfileLocalService) {

		_fitPropFinancialProfileLocalService =
			fitPropFinancialProfileLocalService;
	}

	/**
	 * Adds the fit prop financial profile to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropFinancialProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropFinancialProfile the fit prop financial profile
	 * @return the fit prop financial profile that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropFinancialProfile
		addFitPropFinancialProfile(
			com.nbp.hsra.application.service.model.FitPropFinancialProfile
				fitPropFinancialProfile) {

		return _fitPropFinancialProfileLocalService.addFitPropFinancialProfile(
			fitPropFinancialProfile);
	}

	/**
	 * Creates a new fit prop financial profile with the primary key. Does not add the fit prop financial profile to the database.
	 *
	 * @param fitPropFinancialProfileId the primary key for the new fit prop financial profile
	 * @return the new fit prop financial profile
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropFinancialProfile
		createFitPropFinancialProfile(long fitPropFinancialProfileId) {

		return _fitPropFinancialProfileLocalService.
			createFitPropFinancialProfile(fitPropFinancialProfileId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropFinancialProfileLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fit prop financial profile from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropFinancialProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropFinancialProfile the fit prop financial profile
	 * @return the fit prop financial profile that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropFinancialProfile
		deleteFitPropFinancialProfile(
			com.nbp.hsra.application.service.model.FitPropFinancialProfile
				fitPropFinancialProfile) {

		return _fitPropFinancialProfileLocalService.
			deleteFitPropFinancialProfile(fitPropFinancialProfile);
	}

	/**
	 * Deletes the fit prop financial profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropFinancialProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropFinancialProfileId the primary key of the fit prop financial profile
	 * @return the fit prop financial profile that was removed
	 * @throws PortalException if a fit prop financial profile with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropFinancialProfile
			deleteFitPropFinancialProfile(long fitPropFinancialProfileId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropFinancialProfileLocalService.
			deleteFitPropFinancialProfile(fitPropFinancialProfileId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropFinancialProfileLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fitPropFinancialProfileLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fitPropFinancialProfileLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fitPropFinancialProfileLocalService.dynamicQuery();
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

		return _fitPropFinancialProfileLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropFinancialProfileModelImpl</code>.
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

		return _fitPropFinancialProfileLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropFinancialProfileModelImpl</code>.
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

		return _fitPropFinancialProfileLocalService.dynamicQuery(
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

		return _fitPropFinancialProfileLocalService.dynamicQueryCount(
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

		return _fitPropFinancialProfileLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.FitPropFinancialProfile
		fetchFitPropFinancialProfile(long fitPropFinancialProfileId) {

		return _fitPropFinancialProfileLocalService.
			fetchFitPropFinancialProfile(fitPropFinancialProfileId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fitPropFinancialProfileLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the fit prop financial profile with the primary key.
	 *
	 * @param fitPropFinancialProfileId the primary key of the fit prop financial profile
	 * @return the fit prop financial profile
	 * @throws PortalException if a fit prop financial profile with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropFinancialProfile
			getFitPropFinancialProfile(long fitPropFinancialProfileId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropFinancialProfileLocalService.getFitPropFinancialProfile(
			fitPropFinancialProfileId);
	}

	/**
	 * Returns a range of all the fit prop financial profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropFinancialProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop financial profiles
	 * @param end the upper bound of the range of fit prop financial profiles (not inclusive)
	 * @return the range of fit prop financial profiles
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.FitPropFinancialProfile>
			getFitPropFinancialProfiles(int start, int end) {

		return _fitPropFinancialProfileLocalService.getFitPropFinancialProfiles(
			start, end);
	}

	/**
	 * Returns the number of fit prop financial profiles.
	 *
	 * @return the number of fit prop financial profiles
	 */
	@Override
	public int getFitPropFinancialProfilesCount() {
		return _fitPropFinancialProfileLocalService.
			getFitPropFinancialProfilesCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.FitPropFinancialProfile
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropFinancialProfileException {

		return _fitPropFinancialProfileLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fitPropFinancialProfileLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fitPropFinancialProfileLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropFinancialProfileLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fit prop financial profile in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropFinancialProfileLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropFinancialProfile the fit prop financial profile
	 * @return the fit prop financial profile that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropFinancialProfile
		updateFitPropFinancialProfile(
			com.nbp.hsra.application.service.model.FitPropFinancialProfile
				fitPropFinancialProfile) {

		return _fitPropFinancialProfileLocalService.
			updateFitPropFinancialProfile(fitPropFinancialProfile);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fitPropFinancialProfileLocalService.getBasePersistence();
	}

	@Override
	public FitPropFinancialProfileLocalService getWrappedService() {
		return _fitPropFinancialProfileLocalService;
	}

	@Override
	public void setWrappedService(
		FitPropFinancialProfileLocalService
			fitPropFinancialProfileLocalService) {

		_fitPropFinancialProfileLocalService =
			fitPropFinancialProfileLocalService;
	}

	private FitPropFinancialProfileLocalService
		_fitPropFinancialProfileLocalService;

}