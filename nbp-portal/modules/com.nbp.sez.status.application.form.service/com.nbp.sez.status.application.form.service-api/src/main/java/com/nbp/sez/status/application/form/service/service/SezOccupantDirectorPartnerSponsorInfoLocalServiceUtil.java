/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezOccupantDirectorPartnerSponsorInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezOccupantDirectorPartnerSponsorInfo. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantDirectorPartnerSponsorInfoLocalService
 * @generated
 */
public class SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez occupant director partner sponsor info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfo the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was added
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
		addSezOccupantDirectorPartnerSponsorInfo(
			SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo) {

		return getService().addSezOccupantDirectorPartnerSponsorInfo(
			sezOccupantDirectorPartnerSponsorInfo);
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
	 * Creates a new sez occupant director partner sponsor info with the primary key. Does not add the sez occupant director partner sponsor info to the database.
	 *
	 * @param sezOccDirectSpoId the primary key for the new sez occupant director partner sponsor info
	 * @return the new sez occupant director partner sponsor info
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
		createSezOccupantDirectorPartnerSponsorInfo(long sezOccDirectSpoId) {

		return getService().createSezOccupantDirectorPartnerSponsorInfo(
			sezOccDirectSpoId);
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
	 * Deletes the sez occupant director partner sponsor info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was removed
	 * @throws PortalException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
			deleteSezOccupantDirectorPartnerSponsorInfo(long sezOccDirectSpoId)
		throws PortalException {

		return getService().deleteSezOccupantDirectorPartnerSponsorInfo(
			sezOccDirectSpoId);
	}

	/**
	 * Deletes the sez occupant director partner sponsor info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfo the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was removed
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
		deleteSezOccupantDirectorPartnerSponsorInfo(
			SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo) {

		return getService().deleteSezOccupantDirectorPartnerSponsorInfo(
			sezOccupantDirectorPartnerSponsorInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
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

	public static SezOccupantDirectorPartnerSponsorInfo
		fetchSezOccupantDirectorPartnerSponsorInfo(long sezOccDirectSpoId) {

		return getService().fetchSezOccupantDirectorPartnerSponsorInfo(
			sezOccDirectSpoId);
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

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sez occupant director partner sponsor info with the primary key.
	 *
	 * @param sezOccDirectSpoId the primary key of the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info
	 * @throws PortalException if a sez occupant director partner sponsor info with the primary key could not be found
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
			getSezOccupantDirectorPartnerSponsorInfo(long sezOccDirectSpoId)
		throws PortalException {

		return getService().getSezOccupantDirectorPartnerSponsorInfo(
			sezOccDirectSpoId);
	}

	/**
	 * Returns a range of all the sez occupant director partner sponsor infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantDirectorPartnerSponsorInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez occupant director partner sponsor infos
	 * @param end the upper bound of the range of sez occupant director partner sponsor infos (not inclusive)
	 * @return the range of sez occupant director partner sponsor infos
	 */
	public static List<SezOccupantDirectorPartnerSponsorInfo>
		getSezOccupantDirectorPartnerSponsorInfos(int start, int end) {

		return getService().getSezOccupantDirectorPartnerSponsorInfos(
			start, end);
	}

	/**
	 * Returns the number of sez occupant director partner sponsor infos.
	 *
	 * @return the number of sez occupant director partner sponsor infos
	 */
	public static int getSezOccupantDirectorPartnerSponsorInfosCount() {
		return getService().getSezOccupantDirectorPartnerSponsorInfosCount();
	}

	public static List<SezOccupantDirectorPartnerSponsorInfo> getSezStatusBy_Id(
		long sezApplicationId) {

		return getService().getSezStatusBy_Id(sezApplicationId);
	}

	/**
	 * Updates the sez occupant director partner sponsor info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezOccupantDirectorPartnerSponsorInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezOccupantDirectorPartnerSponsorInfo the sez occupant director partner sponsor info
	 * @return the sez occupant director partner sponsor info that was updated
	 */
	public static SezOccupantDirectorPartnerSponsorInfo
		updateSezOccupantDirectorPartnerSponsorInfo(
			SezOccupantDirectorPartnerSponsorInfo
				sezOccupantDirectorPartnerSponsorInfo) {

		return getService().updateSezOccupantDirectorPartnerSponsorInfo(
			sezOccupantDirectorPartnerSponsorInfo);
	}

	public static SezOccupantDirectorPartnerSponsorInfoLocalService
		getService() {

		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<SezOccupantDirectorPartnerSponsorInfoLocalService> _serviceSnapshot =
			new Snapshot<>(
				SezOccupantDirectorPartnerSponsorInfoLocalServiceUtil.class,
				SezOccupantDirectorPartnerSponsorInfoLocalService.class);

}