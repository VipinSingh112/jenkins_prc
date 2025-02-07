/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FitPropPersonalDetailInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FitPropPersonalDetailInfoLocalService
 * @generated
 */
public class FitPropPersonalDetailInfoLocalServiceWrapper
	implements FitPropPersonalDetailInfoLocalService,
			   ServiceWrapper<FitPropPersonalDetailInfoLocalService> {

	public FitPropPersonalDetailInfoLocalServiceWrapper() {
		this(null);
	}

	public FitPropPersonalDetailInfoLocalServiceWrapper(
		FitPropPersonalDetailInfoLocalService
			fitPropPersonalDetailInfoLocalService) {

		_fitPropPersonalDetailInfoLocalService =
			fitPropPersonalDetailInfoLocalService;
	}

	/**
	 * Adds the fit prop personal detail info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropPersonalDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropPersonalDetailInfo the fit prop personal detail info
	 * @return the fit prop personal detail info that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
		addFitPropPersonalDetailInfo(
			com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
				fitPropPersonalDetailInfo) {

		return _fitPropPersonalDetailInfoLocalService.
			addFitPropPersonalDetailInfo(fitPropPersonalDetailInfo);
	}

	/**
	 * Creates a new fit prop personal detail info with the primary key. Does not add the fit prop personal detail info to the database.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key for the new fit prop personal detail info
	 * @return the new fit prop personal detail info
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
		createFitPropPersonalDetailInfo(long fitPropPersonalDetailInfoId) {

		return _fitPropPersonalDetailInfoLocalService.
			createFitPropPersonalDetailInfo(fitPropPersonalDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropPersonalDetailInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fit prop personal detail info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropPersonalDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropPersonalDetailInfo the fit prop personal detail info
	 * @return the fit prop personal detail info that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
		deleteFitPropPersonalDetailInfo(
			com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
				fitPropPersonalDetailInfo) {

		return _fitPropPersonalDetailInfoLocalService.
			deleteFitPropPersonalDetailInfo(fitPropPersonalDetailInfo);
	}

	/**
	 * Deletes the fit prop personal detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropPersonalDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info that was removed
	 * @throws PortalException if a fit prop personal detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
			deleteFitPropPersonalDetailInfo(long fitPropPersonalDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropPersonalDetailInfoLocalService.
			deleteFitPropPersonalDetailInfo(fitPropPersonalDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropPersonalDetailInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fitPropPersonalDetailInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fitPropPersonalDetailInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fitPropPersonalDetailInfoLocalService.dynamicQuery();
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

		return _fitPropPersonalDetailInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropPersonalDetailInfoModelImpl</code>.
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

		return _fitPropPersonalDetailInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropPersonalDetailInfoModelImpl</code>.
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

		return _fitPropPersonalDetailInfoLocalService.dynamicQuery(
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

		return _fitPropPersonalDetailInfoLocalService.dynamicQueryCount(
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

		return _fitPropPersonalDetailInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
		fetchFitPropPersonalDetailInfo(long fitPropPersonalDetailInfoId) {

		return _fitPropPersonalDetailInfoLocalService.
			fetchFitPropPersonalDetailInfo(fitPropPersonalDetailInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fitPropPersonalDetailInfoLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the fit prop personal detail info with the primary key.
	 *
	 * @param fitPropPersonalDetailInfoId the primary key of the fit prop personal detail info
	 * @return the fit prop personal detail info
	 * @throws PortalException if a fit prop personal detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
			getFitPropPersonalDetailInfo(long fitPropPersonalDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropPersonalDetailInfoLocalService.
			getFitPropPersonalDetailInfo(fitPropPersonalDetailInfoId);
	}

	/**
	 * Returns a range of all the fit prop personal detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.FitPropPersonalDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop personal detail infos
	 * @param end the upper bound of the range of fit prop personal detail infos (not inclusive)
	 * @return the range of fit prop personal detail infos
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo>
			getFitPropPersonalDetailInfos(int start, int end) {

		return _fitPropPersonalDetailInfoLocalService.
			getFitPropPersonalDetailInfos(start, end);
	}

	/**
	 * Returns the number of fit prop personal detail infos.
	 *
	 * @return the number of fit prop personal detail infos
	 */
	@Override
	public int getFitPropPersonalDetailInfosCount() {
		return _fitPropPersonalDetailInfoLocalService.
			getFitPropPersonalDetailInfosCount();
	}

	@Override
	public com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropPersonalDetailInfoException {

		return _fitPropPersonalDetailInfoLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fitPropPersonalDetailInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fitPropPersonalDetailInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fitPropPersonalDetailInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fit prop personal detail info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FitPropPersonalDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fitPropPersonalDetailInfo the fit prop personal detail info
	 * @return the fit prop personal detail info that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
		updateFitPropPersonalDetailInfo(
			com.nbp.hsra.application.service.model.FitPropPersonalDetailInfo
				fitPropPersonalDetailInfo) {

		return _fitPropPersonalDetailInfoLocalService.
			updateFitPropPersonalDetailInfo(fitPropPersonalDetailInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fitPropPersonalDetailInfoLocalService.getBasePersistence();
	}

	@Override
	public FitPropPersonalDetailInfoLocalService getWrappedService() {
		return _fitPropPersonalDetailInfoLocalService;
	}

	@Override
	public void setWrappedService(
		FitPropPersonalDetailInfoLocalService
			fitPropPersonalDetailInfoLocalService) {

		_fitPropPersonalDetailInfoLocalService =
			fitPropPersonalDetailInfoLocalService;
	}

	private FitPropPersonalDetailInfoLocalService
		_fitPropPersonalDetailInfoLocalService;

}