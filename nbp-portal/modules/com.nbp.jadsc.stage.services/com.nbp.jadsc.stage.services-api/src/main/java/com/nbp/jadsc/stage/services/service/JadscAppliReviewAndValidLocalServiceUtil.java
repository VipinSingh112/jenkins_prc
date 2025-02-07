/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JadscAppliReviewAndValid. This utility wraps
 * <code>com.nbp.jadsc.stage.services.service.impl.JadscAppliReviewAndValidLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValidLocalService
 * @generated
 */
public class JadscAppliReviewAndValidLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jadsc.stage.services.service.impl.JadscAppliReviewAndValidLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jadsc appli review and valid to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliReviewAndValidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was added
	 */
	public static JadscAppliReviewAndValid addJadscAppliReviewAndValid(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		return getService().addJadscAppliReviewAndValid(
			jadscAppliReviewAndValid);
	}

	/**
	 * Creates a new jadsc appli review and valid with the primary key. Does not add the jadsc appli review and valid to the database.
	 *
	 * @param jadscAppliReviewAndValidId the primary key for the new jadsc appli review and valid
	 * @return the new jadsc appli review and valid
	 */
	public static JadscAppliReviewAndValid createJadscAppliReviewAndValid(
		long jadscAppliReviewAndValidId) {

		return getService().createJadscAppliReviewAndValid(
			jadscAppliReviewAndValidId);
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
	 * Deletes the jadsc appli review and valid from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliReviewAndValidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was removed
	 */
	public static JadscAppliReviewAndValid deleteJadscAppliReviewAndValid(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		return getService().deleteJadscAppliReviewAndValid(
			jadscAppliReviewAndValid);
	}

	/**
	 * Deletes the jadsc appli review and valid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliReviewAndValidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was removed
	 * @throws PortalException if a jadsc appli review and valid with the primary key could not be found
	 */
	public static JadscAppliReviewAndValid deleteJadscAppliReviewAndValid(
			long jadscAppliReviewAndValidId)
		throws PortalException {

		return getService().deleteJadscAppliReviewAndValid(
			jadscAppliReviewAndValidId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidModelImpl</code>.
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

	public static JadscAppliReviewAndValid fetchJadscAppliReviewAndValid(
		long jadscAppliReviewAndValidId) {

		return getService().fetchJadscAppliReviewAndValid(
			jadscAppliReviewAndValidId);
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
	 * Returns the jadsc appli review and valid with the primary key.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid
	 * @throws PortalException if a jadsc appli review and valid with the primary key could not be found
	 */
	public static JadscAppliReviewAndValid getJadscAppliReviewAndValid(
			long jadscAppliReviewAndValidId)
		throws PortalException {

		return getService().getJadscAppliReviewAndValid(
			jadscAppliReviewAndValidId);
	}

	public static JadscAppliReviewAndValid getJadscAppliReviewAndValidByCI(
			String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return getService().getJadscAppliReviewAndValidByCI(caseId);
	}

	public static List<JadscAppliReviewAndValid>
		getJadscAppliReviewAndValidByVersionOfApplication(
			String versionOfApplication) {

		return getService().getJadscAppliReviewAndValidByVersionOfApplication(
			versionOfApplication);
	}

	/**
	 * Returns a range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jadsc.stage.services.model.impl.JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @return the range of jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> getJadscAppliReviewAndValids(
		int start, int end) {

		return getService().getJadscAppliReviewAndValids(start, end);
	}

	/**
	 * Returns the number of jadsc appli review and valids.
	 *
	 * @return the number of jadsc appli review and valids
	 */
	public static int getJadscAppliReviewAndValidsCount() {
		return getService().getJadscAppliReviewAndValidsCount();
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
	 * Updates the jadsc appli review and valid in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JadscAppliReviewAndValidLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was updated
	 */
	public static JadscAppliReviewAndValid updateJadscAppliReviewAndValid(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		return getService().updateJadscAppliReviewAndValid(
			jadscAppliReviewAndValid);
	}

	public static JadscAppliReviewAndValid updateJadscAppliReviewAndValid(
		String caseId, String versionOfApplication, String status) {

		return getService().updateJadscAppliReviewAndValid(
			caseId, versionOfApplication, status);
	}

	public static JadscAppliReviewAndValidLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JadscAppliReviewAndValidLocalService>
		_serviceSnapshot = new Snapshot<>(
			JadscAppliReviewAndValidLocalServiceUtil.class,
			JadscAppliReviewAndValidLocalService.class);

}