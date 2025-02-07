/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OgtInsolventPersonDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OgtInsolventPersonDetailLocalService
 * @generated
 */
public class OgtInsolventPersonDetailLocalServiceWrapper
	implements OgtInsolventPersonDetailLocalService,
			   ServiceWrapper<OgtInsolventPersonDetailLocalService> {

	public OgtInsolventPersonDetailLocalServiceWrapper() {
		this(null);
	}

	public OgtInsolventPersonDetailLocalServiceWrapper(
		OgtInsolventPersonDetailLocalService
			ogtInsolventPersonDetailLocalService) {

		_ogtInsolventPersonDetailLocalService =
			ogtInsolventPersonDetailLocalService;
	}

	/**
	 * Adds the ogt insolvent person detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtInsolventPersonDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was added
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
		addOgtInsolventPersonDetail(
			com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
				ogtInsolventPersonDetail) {

		return _ogtInsolventPersonDetailLocalService.
			addOgtInsolventPersonDetail(ogtInsolventPersonDetail);
	}

	/**
	 * Creates a new ogt insolvent person detail with the primary key. Does not add the ogt insolvent person detail to the database.
	 *
	 * @param ogtInsolventPersonDetailId the primary key for the new ogt insolvent person detail
	 * @return the new ogt insolvent person detail
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
		createOgtInsolventPersonDetail(long ogtInsolventPersonDetailId) {

		return _ogtInsolventPersonDetailLocalService.
			createOgtInsolventPersonDetail(ogtInsolventPersonDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtInsolventPersonDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ogt insolvent person detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtInsolventPersonDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was removed
	 * @throws PortalException if a ogt insolvent person detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
			deleteOgtInsolventPersonDetail(long ogtInsolventPersonDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtInsolventPersonDetailLocalService.
			deleteOgtInsolventPersonDetail(ogtInsolventPersonDetailId);
	}

	/**
	 * Deletes the ogt insolvent person detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtInsolventPersonDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was removed
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
		deleteOgtInsolventPersonDetail(
			com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
				ogtInsolventPersonDetail) {

		return _ogtInsolventPersonDetailLocalService.
			deleteOgtInsolventPersonDetail(ogtInsolventPersonDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtInsolventPersonDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ogtInsolventPersonDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ogtInsolventPersonDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ogtInsolventPersonDetailLocalService.dynamicQuery();
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

		return _ogtInsolventPersonDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailModelImpl</code>.
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

		return _ogtInsolventPersonDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailModelImpl</code>.
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

		return _ogtInsolventPersonDetailLocalService.dynamicQuery(
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

		return _ogtInsolventPersonDetailLocalService.dynamicQueryCount(
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

		return _ogtInsolventPersonDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
		fetchOgtInsolventPersonDetail(long ogtInsolventPersonDetailId) {

		return _ogtInsolventPersonDetailLocalService.
			fetchOgtInsolventPersonDetail(ogtInsolventPersonDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ogtInsolventPersonDetailLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ogtInsolventPersonDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
			getOgtById(long ogtApplicationId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtInsolventPersonDetailException {

		return _ogtInsolventPersonDetailLocalService.getOgtById(
			ogtApplicationId);
	}

	/**
	 * Returns the ogt insolvent person detail with the primary key.
	 *
	 * @param ogtInsolventPersonDetailId the primary key of the ogt insolvent person detail
	 * @return the ogt insolvent person detail
	 * @throws PortalException if a ogt insolvent person detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
			getOgtInsolventPersonDetail(long ogtInsolventPersonDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtInsolventPersonDetailLocalService.
			getOgtInsolventPersonDetail(ogtInsolventPersonDetailId);
	}

	/**
	 * Returns a range of all the ogt insolvent person details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtInsolventPersonDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt insolvent person details
	 * @param end the upper bound of the range of ogt insolvent person details (not inclusive)
	 * @return the range of ogt insolvent person details
	 */
	@Override
	public java.util.List
		<com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail>
			getOgtInsolventPersonDetails(int start, int end) {

		return _ogtInsolventPersonDetailLocalService.
			getOgtInsolventPersonDetails(start, end);
	}

	/**
	 * Returns the number of ogt insolvent person details.
	 *
	 * @return the number of ogt insolvent person details
	 */
	@Override
	public int getOgtInsolventPersonDetailsCount() {
		return _ogtInsolventPersonDetailLocalService.
			getOgtInsolventPersonDetailsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ogtInsolventPersonDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ogtInsolventPersonDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ogt insolvent person detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtInsolventPersonDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtInsolventPersonDetail the ogt insolvent person detail
	 * @return the ogt insolvent person detail that was updated
	 */
	@Override
	public com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
		updateOgtInsolventPersonDetail(
			com.nbp.ogt.application.form.services.model.OgtInsolventPersonDetail
				ogtInsolventPersonDetail) {

		return _ogtInsolventPersonDetailLocalService.
			updateOgtInsolventPersonDetail(ogtInsolventPersonDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ogtInsolventPersonDetailLocalService.getBasePersistence();
	}

	@Override
	public OgtInsolventPersonDetailLocalService getWrappedService() {
		return _ogtInsolventPersonDetailLocalService;
	}

	@Override
	public void setWrappedService(
		OgtInsolventPersonDetailLocalService
			ogtInsolventPersonDetailLocalService) {

		_ogtInsolventPersonDetailLocalService =
			ogtInsolventPersonDetailLocalService;
	}

	private OgtInsolventPersonDetailLocalService
		_ogtInsolventPersonDetailLocalService;

}