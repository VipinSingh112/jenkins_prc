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

import com.nbp.osi.insolvency.application.form.services.model.OsiAssessmentSignature;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiAssessmentSignature. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiAssessmentSignatureLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssessmentSignatureLocalService
 * @generated
 */
public class OsiAssessmentSignatureLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiAssessmentSignatureLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi assessment signature to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssessmentSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 * @return the osi assessment signature that was added
	 */
	public static OsiAssessmentSignature addOsiAssessmentSignature(
		OsiAssessmentSignature osiAssessmentSignature) {

		return getService().addOsiAssessmentSignature(osiAssessmentSignature);
	}

	/**
	 * Creates a new osi assessment signature with the primary key. Does not add the osi assessment signature to the database.
	 *
	 * @param osiAssessmentSignatureId the primary key for the new osi assessment signature
	 * @return the new osi assessment signature
	 */
	public static OsiAssessmentSignature createOsiAssessmentSignature(
		long osiAssessmentSignatureId) {

		return getService().createOsiAssessmentSignature(
			osiAssessmentSignatureId);
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
	 * Deletes the osi assessment signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssessmentSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature that was removed
	 * @throws PortalException if a osi assessment signature with the primary key could not be found
	 */
	public static OsiAssessmentSignature deleteOsiAssessmentSignature(
			long osiAssessmentSignatureId)
		throws PortalException {

		return getService().deleteOsiAssessmentSignature(
			osiAssessmentSignatureId);
	}

	/**
	 * Deletes the osi assessment signature from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssessmentSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 * @return the osi assessment signature that was removed
	 */
	public static OsiAssessmentSignature deleteOsiAssessmentSignature(
		OsiAssessmentSignature osiAssessmentSignature) {

		return getService().deleteOsiAssessmentSignature(
			osiAssessmentSignature);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureModelImpl</code>.
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

	public static OsiAssessmentSignature fetchOsiAssessmentSignature(
		long osiAssessmentSignatureId) {

		return getService().fetchOsiAssessmentSignature(
			osiAssessmentSignatureId);
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
	 * Returns the osi assessment signature with the primary key.
	 *
	 * @param osiAssessmentSignatureId the primary key of the osi assessment signature
	 * @return the osi assessment signature
	 * @throws PortalException if a osi assessment signature with the primary key could not be found
	 */
	public static OsiAssessmentSignature getOsiAssessmentSignature(
			long osiAssessmentSignatureId)
		throws PortalException {

		return getService().getOsiAssessmentSignature(osiAssessmentSignatureId);
	}

	/**
	 * Returns a range of all the osi assessment signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssessmentSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assessment signatures
	 * @param end the upper bound of the range of osi assessment signatures (not inclusive)
	 * @return the range of osi assessment signatures
	 */
	public static List<OsiAssessmentSignature> getOsiAssessmentSignatures(
		int start, int end) {

		return getService().getOsiAssessmentSignatures(start, end);
	}

	/**
	 * Returns the number of osi assessment signatures.
	 *
	 * @return the number of osi assessment signatures
	 */
	public static int getOsiAssessmentSignaturesCount() {
		return getService().getOsiAssessmentSignaturesCount();
	}

	public static OsiAssessmentSignature getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiAssessmentSignatureException {

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
	 * Updates the osi assessment signature in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssessmentSignatureLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssessmentSignature the osi assessment signature
	 * @return the osi assessment signature that was updated
	 */
	public static OsiAssessmentSignature updateOsiAssessmentSignature(
		OsiAssessmentSignature osiAssessmentSignature) {

		return getService().updateOsiAssessmentSignature(
			osiAssessmentSignature);
	}

	public static OsiAssessmentSignatureLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiAssessmentSignatureLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiAssessmentSignatureLocalServiceUtil.class,
			OsiAssessmentSignatureLocalService.class);

}