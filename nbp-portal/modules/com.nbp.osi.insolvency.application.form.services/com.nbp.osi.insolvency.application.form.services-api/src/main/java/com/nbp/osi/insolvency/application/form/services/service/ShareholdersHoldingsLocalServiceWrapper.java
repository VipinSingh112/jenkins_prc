/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link ShareholdersHoldingsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ShareholdersHoldingsLocalService
 * @generated
 */
public class ShareholdersHoldingsLocalServiceWrapper
	implements ServiceWrapper<ShareholdersHoldingsLocalService>,
			   ShareholdersHoldingsLocalService {

	public ShareholdersHoldingsLocalServiceWrapper() {
		this(null);
	}

	public ShareholdersHoldingsLocalServiceWrapper(
		ShareholdersHoldingsLocalService shareholdersHoldingsLocalService) {

		_shareholdersHoldingsLocalService = shareholdersHoldingsLocalService;
	}

	/**
	 * Adds the shareholders holdings to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShareholdersHoldingsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shareholdersHoldings the shareholders holdings
	 * @return the shareholders holdings that was added
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings addShareholdersHoldings(
				com.nbp.osi.insolvency.application.form.services.model.
					ShareholdersHoldings shareholdersHoldings) {

		return _shareholdersHoldingsLocalService.addShareholdersHoldings(
			shareholdersHoldings);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shareholdersHoldingsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new shareholders holdings with the primary key. Does not add the shareholders holdings to the database.
	 *
	 * @param shareholdersHoldingsId the primary key for the new shareholders holdings
	 * @return the new shareholders holdings
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings createShareholdersHoldings(
				long shareholdersHoldingsId) {

		return _shareholdersHoldingsLocalService.createShareholdersHoldings(
			shareholdersHoldingsId);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_shareholdersHoldingsLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shareholdersHoldingsLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the shareholders holdings with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShareholdersHoldingsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings that was removed
	 * @throws PortalException if a shareholders holdings with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings deleteShareholdersHoldings(
					long shareholdersHoldingsId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _shareholdersHoldingsLocalService.deleteShareholdersHoldings(
			shareholdersHoldingsId);
	}

	/**
	 * Deletes the shareholders holdings from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShareholdersHoldingsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shareholdersHoldings the shareholders holdings
	 * @return the shareholders holdings that was removed
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings deleteShareholdersHoldings(
				com.nbp.osi.insolvency.application.form.services.model.
					ShareholdersHoldings shareholdersHoldings) {

		return _shareholdersHoldingsLocalService.deleteShareholdersHoldings(
			shareholdersHoldings);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _shareholdersHoldingsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _shareholdersHoldingsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shareholdersHoldingsLocalService.dynamicQuery();
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

		return _shareholdersHoldingsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.ShareholdersHoldingsModelImpl</code>.
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

		return _shareholdersHoldingsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.ShareholdersHoldingsModelImpl</code>.
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

		return _shareholdersHoldingsLocalService.dynamicQuery(
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

		return _shareholdersHoldingsLocalService.dynamicQueryCount(
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

		return _shareholdersHoldingsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings fetchShareholdersHoldings(
				long shareholdersHoldingsId) {

		return _shareholdersHoldingsLocalService.fetchShareholdersHoldings(
			shareholdersHoldingsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _shareholdersHoldingsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _shareholdersHoldingsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _shareholdersHoldingsLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings> getOsiById(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchShareholdersHoldingsException {

		return _shareholdersHoldingsLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _shareholdersHoldingsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the shareholders holdings with the primary key.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings
	 * @throws PortalException if a shareholders holdings with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings getShareholdersHoldings(
					long shareholdersHoldingsId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _shareholdersHoldingsLocalService.getShareholdersHoldings(
			shareholdersHoldingsId);
	}

	/**
	 * Returns a range of all the shareholders holdingses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.ShareholdersHoldingsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholders holdingses
	 * @param end the upper bound of the range of shareholders holdingses (not inclusive)
	 * @return the range of shareholders holdingses
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings> getShareholdersHoldingses(
				int start, int end) {

		return _shareholdersHoldingsLocalService.getShareholdersHoldingses(
			start, end);
	}

	/**
	 * Returns the number of shareholders holdingses.
	 *
	 * @return the number of shareholders holdingses
	 */
	@Override
	public int getShareholdersHoldingsesCount() {
		return _shareholdersHoldingsLocalService.
			getShareholdersHoldingsesCount();
	}

	/**
	 * Updates the shareholders holdings in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ShareholdersHoldingsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param shareholdersHoldings the shareholders holdings
	 * @return the shareholders holdings that was updated
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			ShareholdersHoldings updateShareholdersHoldings(
				com.nbp.osi.insolvency.application.form.services.model.
					ShareholdersHoldings shareholdersHoldings) {

		return _shareholdersHoldingsLocalService.updateShareholdersHoldings(
			shareholdersHoldings);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _shareholdersHoldingsLocalService.getBasePersistence();
	}

	@Override
	public ShareholdersHoldingsLocalService getWrappedService() {
		return _shareholdersHoldingsLocalService;
	}

	@Override
	public void setWrappedService(
		ShareholdersHoldingsLocalService shareholdersHoldingsLocalService) {

		_shareholdersHoldingsLocalService = shareholdersHoldingsLocalService;
	}

	private ShareholdersHoldingsLocalService _shareholdersHoldingsLocalService;

}