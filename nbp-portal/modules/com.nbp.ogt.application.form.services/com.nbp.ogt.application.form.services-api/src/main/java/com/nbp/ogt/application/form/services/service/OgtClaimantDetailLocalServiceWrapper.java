/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OgtClaimantDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtClaimantDetailLocalService
 * @generated
 */
public class OgtClaimantDetailLocalServiceWrapper
	implements OgtClaimantDetailLocalService,
			   ServiceWrapper<OgtClaimantDetailLocalService> {

	public OgtClaimantDetailLocalServiceWrapper() {
		this(null);
	}

	public OgtClaimantDetailLocalServiceWrapper(
		OgtClaimantDetailLocalService ogtClaimantDetailLocalService) {

		_ogtClaimantDetailLocalService = ogtClaimantDetailLocalService;
	}

	/**
	 * Adds the ogt claimant detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was added
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimantDetail
		addOgtClaimantDetail(
			com.nbp.ogt.application.form.services.model.OgtClaimantDetail
				ogtClaimantDetail) {

		return _ogtClaimantDetailLocalService.addOgtClaimantDetail(
			ogtClaimantDetail);
	}

	/**
	 * Creates a new ogt claimant detail with the primary key. Does not add the ogt claimant detail to the database.
	 *
	 * @param ogtClaimantDetailId the primary key for the new ogt claimant detail
	 * @return the new ogt claimant detail
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimantDetail
		createOgtClaimantDetail(long ogtClaimantDetailId) {

		return _ogtClaimantDetailLocalService.createOgtClaimantDetail(
			ogtClaimantDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimantDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ogt claimant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 * @throws PortalException if a ogt claimant detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimantDetail
			deleteOgtClaimantDetail(long ogtClaimantDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimantDetailLocalService.deleteOgtClaimantDetail(
			ogtClaimantDetailId);
	}

	/**
	 * Deletes the ogt claimant detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was removed
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimantDetail
		deleteOgtClaimantDetail(
			com.nbp.ogt.application.form.services.model.OgtClaimantDetail
				ogtClaimantDetail) {

		return _ogtClaimantDetailLocalService.deleteOgtClaimantDetail(
			ogtClaimantDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimantDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtClaimantDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtClaimantDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtClaimantDetailLocalService.dynamicQuery();
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

		return _ogtClaimantDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
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

		return _ogtClaimantDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
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

		return _ogtClaimantDetailLocalService.dynamicQuery(
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

		return _ogtClaimantDetailLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ogtClaimantDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimantDetail
		fetchOgtClaimantDetail(long ogtClaimantDetailId) {

		return _ogtClaimantDetailLocalService.fetchOgtClaimantDetail(
			ogtClaimantDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtClaimantDetailLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtClaimantDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimantDetail
			getOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtClaimantDetailException {

		return _ogtClaimantDetailLocalService.getOgtById(ogtApplicationId);
	}

	/**
	 * Returns the ogt claimant detail with the primary key.
	 *
	 * @param ogtClaimantDetailId the primary key of the ogt claimant detail
	 * @return the ogt claimant detail
	 * @throws PortalException if a ogt claimant detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimantDetail
			getOgtClaimantDetail(long ogtClaimantDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimantDetailLocalService.getOgtClaimantDetail(
			ogtClaimantDetailId);
	}

	/**
	 * Returns a range of all the ogt claimant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtClaimantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt claimant details
	 * @param end the upper bound of the range of ogt claimant details (not inclusive)
	 * @return the range of ogt claimant details
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtClaimantDetail>
			getOgtClaimantDetails(int start, int end) {

		return _ogtClaimantDetailLocalService.getOgtClaimantDetails(start, end);
	}

	/**
	 * Returns the number of ogt claimant details.
	 *
	 * @return the number of ogt claimant details
	 */
	@Override
	public int getOgtClaimantDetailsCount() {
		return _ogtClaimantDetailLocalService.getOgtClaimantDetailsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtClaimantDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtClaimantDetailLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ogt claimant detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtClaimantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtClaimantDetail the ogt claimant detail
	 * @return the ogt claimant detail that was updated
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtClaimantDetail
		updateOgtClaimantDetail(
			com.nbp.ogt.application.form.services.model.OgtClaimantDetail
				ogtClaimantDetail) {

		return _ogtClaimantDetailLocalService.updateOgtClaimantDetail(
			ogtClaimantDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtClaimantDetailLocalService.getBasePersistence();
	}

	@Override
	public OgtClaimantDetailLocalService getWrappedService() {
		return _ogtClaimantDetailLocalService;
	}

	@Override
	public void setWrappedService(
		OgtClaimantDetailLocalService ogtClaimantDetailLocalService) {

		_ogtClaimantDetailLocalService = ogtClaimantDetailLocalService;
	}

	private OgtClaimantDetailLocalService _ogtClaimantDetailLocalService;

}