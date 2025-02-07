/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FitPropBusinessInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropBusinessInfoLocalService
 * @generated
 */
public class FitPropBusinessInfoLocalServiceWrapper
	implements FitPropBusinessInfoLocalService,
			   ServiceWrapper<FitPropBusinessInfoLocalService> {

	public FitPropBusinessInfoLocalServiceWrapper() {
		this(null);
	}

	public FitPropBusinessInfoLocalServiceWrapper(
		FitPropBusinessInfoLocalService fitPropBusinessInfoLocalService) {

		_fitPropBusinessInfoLocalService = fitPropBusinessInfoLocalService;
	}

	/**
	 * Adds the fit prop business info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 * @return the fit prop business info that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropBusinessInfo
		addFitPropBusinessInfo(
			com.nbp.hsra.application.service.model.FitPropBusinessInfo
				fitPropBusinessInfo) {

		return _fitPropBusinessInfoLocalService.addFitPropBusinessInfo(
			fitPropBusinessInfo);
	}

	/**
	 * Creates a new fit prop business info with the primary key. Does not add the fit prop business info to the database.
	 *
	 * @param fitPropBusinessInfoId the primary key for the new fit prop business info
	 * @return the new fit prop business info
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropBusinessInfo
		createFitPropBusinessInfo(long fitPropBusinessInfoId) {

		return _fitPropBusinessInfoLocalService.createFitPropBusinessInfo(
			fitPropBusinessInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropBusinessInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fit prop business info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 * @return the fit prop business info that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropBusinessInfo
		deleteFitPropBusinessInfo(
			com.nbp.hsra.application.service.model.FitPropBusinessInfo
				fitPropBusinessInfo) {

		return _fitPropBusinessInfoLocalService.deleteFitPropBusinessInfo(
			fitPropBusinessInfo);
	}

	/**
	 * Deletes the fit prop business info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info that was removed
	 * @throws PortalException if a fit prop business info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropBusinessInfo
			deleteFitPropBusinessInfo(long fitPropBusinessInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropBusinessInfoLocalService.deleteFitPropBusinessInfo(
			fitPropBusinessInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropBusinessInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fitPropBusinessInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fitPropBusinessInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fitPropBusinessInfoLocalService.dynamicQuery();
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

		return _fitPropBusinessInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropBusinessInfoModelImpl</code>.
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

		return _fitPropBusinessInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropBusinessInfoModelImpl</code>.
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

		return _fitPropBusinessInfoLocalService.dynamicQuery(
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

		return _fitPropBusinessInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _fitPropBusinessInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.FitPropBusinessInfo
		fetchFitPropBusinessInfo(long fitPropBusinessInfoId) {

		return _fitPropBusinessInfoLocalService.fetchFitPropBusinessInfo(
			fitPropBusinessInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fitPropBusinessInfoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the fit prop business info with the primary key.
	 *
	 * @param fitPropBusinessInfoId the primary key of the fit prop business info
	 * @return the fit prop business info
	 * @throws PortalException if a fit prop business info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropBusinessInfo
			getFitPropBusinessInfo(long fitPropBusinessInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropBusinessInfoLocalService.getFitPropBusinessInfo(
			fitPropBusinessInfoId);
	}

	/**
	 * Returns a range of all the fit prop business infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropBusinessInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop business infos
	 * @param end the upper bound of the range of fit prop business infos (not inclusive)
	 * @return the range of fit prop business infos
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.FitPropBusinessInfo>
			getFitPropBusinessInfos(int start, int end) {

		return _fitPropBusinessInfoLocalService.getFitPropBusinessInfos(
			start, end);
	}

	/**
	 * Returns the number of fit prop business infos.
	 *
	 * @return the number of fit prop business infos
	 */
	@Override
	public int getFitPropBusinessInfosCount() {
		return _fitPropBusinessInfoLocalService.getFitPropBusinessInfosCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.FitPropBusinessInfo
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropBusinessInfoException {

		return _fitPropBusinessInfoLocalService.getHsraById(hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fitPropBusinessInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fitPropBusinessInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropBusinessInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fit prop business info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropBusinessInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropBusinessInfo the fit prop business info
	 * @return the fit prop business info that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropBusinessInfo
		updateFitPropBusinessInfo(
			com.nbp.hsra.application.service.model.FitPropBusinessInfo
				fitPropBusinessInfo) {

		return _fitPropBusinessInfoLocalService.updateFitPropBusinessInfo(
			fitPropBusinessInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fitPropBusinessInfoLocalService.getBasePersistence();
	}

	@Override
	public FitPropBusinessInfoLocalService getWrappedService() {
		return _fitPropBusinessInfoLocalService;
	}

	@Override
	public void setWrappedService(
		FitPropBusinessInfoLocalService fitPropBusinessInfoLocalService) {

		_fitPropBusinessInfoLocalService = fitPropBusinessInfoLocalService;
	}

	private FitPropBusinessInfoLocalService _fitPropBusinessInfoLocalService;

}