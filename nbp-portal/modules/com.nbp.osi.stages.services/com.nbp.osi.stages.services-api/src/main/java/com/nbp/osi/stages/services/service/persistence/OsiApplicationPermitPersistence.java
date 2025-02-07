/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.osi.stages.services.exception.NoSuchOsiApplicationPermitException;
import com.nbp.osi.stages.services.model.OsiApplicationPermit;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the osi application permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiApplicationPermitUtil
 * @generated
 */
@ProviderType
public interface OsiApplicationPermitPersistence
	extends BasePersistence<OsiApplicationPermit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OsiApplicationPermitUtil} to access the osi application permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the osi application permit where caseId = &#63; or throws a <code>NoSuchOsiApplicationPermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application permit
	 * @throws NoSuchOsiApplicationPermitException if a matching osi application permit could not be found
	 */
	public OsiApplicationPermit findBygetOsiAppPermitByCaseId(String caseId)
		throws NoSuchOsiApplicationPermitException;

	/**
	 * Returns the osi application permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi application permit, or <code>null</code> if a matching osi application permit could not be found
	 */
	public OsiApplicationPermit fetchBygetOsiAppPermitByCaseId(String caseId);

	/**
	 * Returns the osi application permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi application permit, or <code>null</code> if a matching osi application permit could not be found
	 */
	public OsiApplicationPermit fetchBygetOsiAppPermitByCaseId(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the osi application permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi application permit that was removed
	 */
	public OsiApplicationPermit removeBygetOsiAppPermitByCaseId(String caseId)
		throws NoSuchOsiApplicationPermitException;

	/**
	 * Returns the number of osi application permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi application permits
	 */
	public int countBygetOsiAppPermitByCaseId(String caseId);

	/**
	 * Caches the osi application permit in the entity cache if it is enabled.
	 *
	 * @param osiApplicationPermit the osi application permit
	 */
	public void cacheResult(OsiApplicationPermit osiApplicationPermit);

	/**
	 * Caches the osi application permits in the entity cache if it is enabled.
	 *
	 * @param osiApplicationPermits the osi application permits
	 */
	public void cacheResult(
		java.util.List<OsiApplicationPermit> osiApplicationPermits);

	/**
	 * Creates a new osi application permit with the primary key. Does not add the osi application permit to the database.
	 *
	 * @param osiApplicationPermitId the primary key for the new osi application permit
	 * @return the new osi application permit
	 */
	public OsiApplicationPermit create(long osiApplicationPermitId);

	/**
	 * Removes the osi application permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit that was removed
	 * @throws NoSuchOsiApplicationPermitException if a osi application permit with the primary key could not be found
	 */
	public OsiApplicationPermit remove(long osiApplicationPermitId)
		throws NoSuchOsiApplicationPermitException;

	public OsiApplicationPermit updateImpl(
		OsiApplicationPermit osiApplicationPermit);

	/**
	 * Returns the osi application permit with the primary key or throws a <code>NoSuchOsiApplicationPermitException</code> if it could not be found.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit
	 * @throws NoSuchOsiApplicationPermitException if a osi application permit with the primary key could not be found
	 */
	public OsiApplicationPermit findByPrimaryKey(long osiApplicationPermitId)
		throws NoSuchOsiApplicationPermitException;

	/**
	 * Returns the osi application permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiApplicationPermitId the primary key of the osi application permit
	 * @return the osi application permit, or <code>null</code> if a osi application permit with the primary key could not be found
	 */
	public OsiApplicationPermit fetchByPrimaryKey(long osiApplicationPermitId);

	/**
	 * Returns all the osi application permits.
	 *
	 * @return the osi application permits
	 */
	public java.util.List<OsiApplicationPermit> findAll();

	/**
	 * Returns a range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @return the range of osi application permits
	 */
	public java.util.List<OsiApplicationPermit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi application permits
	 */
	public java.util.List<OsiApplicationPermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationPermit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the osi application permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiApplicationPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi application permits
	 * @param end the upper bound of the range of osi application permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi application permits
	 */
	public java.util.List<OsiApplicationPermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OsiApplicationPermit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the osi application permits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of osi application permits.
	 *
	 * @return the number of osi application permits
	 */
	public int countAll();

}