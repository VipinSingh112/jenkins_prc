/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.ShareholdersHoldings;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ShareholdersHoldings. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.ShareholdersHoldingsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ShareholdersHoldingsLocalService
 * @generated
 */
public class ShareholdersHoldingsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.ShareholdersHoldingsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static ShareholdersHoldings addShareholdersHoldings(
		ShareholdersHoldings shareholdersHoldings) {

		return getService().addShareholdersHoldings(shareholdersHoldings);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new shareholders holdings with the primary key. Does not add the shareholders holdings to the database.
	 *
	 * @param shareholdersHoldingsId the primary key for the new shareholders holdings
	 * @return the new shareholders holdings
	 */
	public static ShareholdersHoldings createShareholdersHoldings(
		long shareholdersHoldingsId) {

		return getService().createShareholdersHoldings(shareholdersHoldingsId);
	}

	public static void deleteBY_Id(long applicationId) {
		getService().deleteBY_Id(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	public static ShareholdersHoldings deleteShareholdersHoldings(
			long shareholdersHoldingsId)
		throws PortalException {

		return getService().deleteShareholdersHoldings(shareholdersHoldingsId);
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
	public static ShareholdersHoldings deleteShareholdersHoldings(
		ShareholdersHoldings shareholdersHoldings) {

		return getService().deleteShareholdersHoldings(shareholdersHoldings);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ShareholdersHoldings fetchShareholdersHoldings(
		long shareholdersHoldingsId) {

		return getService().fetchShareholdersHoldings(shareholdersHoldingsId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static List<ShareholdersHoldings> getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchShareholdersHoldingsException {

		return getService().getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the shareholders holdings with the primary key.
	 *
	 * @param shareholdersHoldingsId the primary key of the shareholders holdings
	 * @return the shareholders holdings
	 * @throws PortalException if a shareholders holdings with the primary key could not be found
	 */
	public static ShareholdersHoldings getShareholdersHoldings(
			long shareholdersHoldingsId)
		throws PortalException {

		return getService().getShareholdersHoldings(shareholdersHoldingsId);
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
	public static List<ShareholdersHoldings> getShareholdersHoldingses(
		int start, int end) {

		return getService().getShareholdersHoldingses(start, end);
	}

	/**
	 * Returns the number of shareholders holdingses.
	 *
	 * @return the number of shareholders holdingses
	 */
	public static int getShareholdersHoldingsesCount() {
		return getService().getShareholdersHoldingsesCount();
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
	public static ShareholdersHoldings updateShareholdersHoldings(
		ShareholdersHoldings shareholdersHoldings) {

		return getService().updateShareholdersHoldings(shareholdersHoldings);
	}

	public static ShareholdersHoldingsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ShareholdersHoldingsLocalService>
		_serviceSnapshot = new Snapshot<>(
			ShareholdersHoldingsLocalServiceUtil.class,
			ShareholdersHoldingsLocalService.class);

}