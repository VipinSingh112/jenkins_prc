/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.agriculture.stages.services.exception.NoSuchAgriculturePermitException;
import com.nbp.agriculture.stages.services.model.AgriculturePermit;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the agriculture permit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AgriculturePermitUtil
 * @generated
 */
@ProviderType
public interface AgriculturePermitPersistence
	extends BasePersistence<AgriculturePermit> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AgriculturePermitUtil} to access the agriculture permit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the agriculture permit where caseId = &#63; or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	public AgriculturePermit findBygetAgriculturePermitBy_CI(String caseId)
		throws NoSuchAgriculturePermitException;

	/**
	 * Returns the agriculture permit where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public AgriculturePermit fetchBygetAgriculturePermitBy_CI(String caseId);

	/**
	 * Returns the agriculture permit where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public AgriculturePermit fetchBygetAgriculturePermitBy_CI(
		String caseId, boolean useFinderCache);

	/**
	 * Removes the agriculture permit where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture permit that was removed
	 */
	public AgriculturePermit removeBygetAgriculturePermitBy_CI(String caseId)
		throws NoSuchAgriculturePermitException;

	/**
	 * Returns the number of agriculture permits where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture permits
	 */
	public int countBygetAgriculturePermitBy_CI(String caseId);

	/**
	 * Returns all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permits
	 */
	public java.util.List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber);

	/**
	 * Returns a range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @return the range of matching agriculture permits
	 */
	public java.util.List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end);

	/**
	 * Returns an ordered range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture permits
	 */
	public java.util.List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture permits where pirPermtNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture permits
	 */
	public java.util.List<AgriculturePermit> findBygetAgriculturePermitBy_PN(
		String pirPermtNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	public AgriculturePermit findBygetAgriculturePermitBy_PN_First(
			String pirPermtNumber,
			com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
				orderByComparator)
		throws NoSuchAgriculturePermitException;

	/**
	 * Returns the first agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public AgriculturePermit fetchBygetAgriculturePermitBy_PN_First(
		String pirPermtNumber,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
			orderByComparator);

	/**
	 * Returns the last agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	public AgriculturePermit findBygetAgriculturePermitBy_PN_Last(
			String pirPermtNumber,
			com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
				orderByComparator)
		throws NoSuchAgriculturePermitException;

	/**
	 * Returns the last agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public AgriculturePermit fetchBygetAgriculturePermitBy_PN_Last(
		String pirPermtNumber,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
			orderByComparator);

	/**
	 * Returns the agriculture permits before and after the current agriculture permit in the ordered set where pirPermtNumber = &#63;.
	 *
	 * @param agriculturePermitId the primary key of the current agriculture permit
	 * @param pirPermtNumber the pir permt number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture permit
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	public AgriculturePermit[] findBygetAgriculturePermitBy_PN_PrevAndNext(
			long agriculturePermitId, String pirPermtNumber,
			com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
				orderByComparator)
		throws NoSuchAgriculturePermitException;

	/**
	 * Removes all the agriculture permits where pirPermtNumber = &#63; from the database.
	 *
	 * @param pirPermtNumber the pir permt number
	 */
	public void removeBygetAgriculturePermitBy_PN(String pirPermtNumber);

	/**
	 * Returns the number of agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the number of matching agriculture permits
	 */
	public int countBygetAgriculturePermitBy_PN(String pirPermtNumber);

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permit
	 * @throws NoSuchAgriculturePermitException if a matching agriculture permit could not be found
	 */
	public AgriculturePermit findBygetAgriculturePermitBy_PermitNum(
			String pirPermtNumber)
		throws NoSuchAgriculturePermitException;

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public AgriculturePermit fetchBygetAgriculturePermitBy_PermitNum(
		String pirPermtNumber);

	/**
	 * Returns the agriculture permit where pirPermtNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture permit, or <code>null</code> if a matching agriculture permit could not be found
	 */
	public AgriculturePermit fetchBygetAgriculturePermitBy_PermitNum(
		String pirPermtNumber, boolean useFinderCache);

	/**
	 * Removes the agriculture permit where pirPermtNumber = &#63; from the database.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the agriculture permit that was removed
	 */
	public AgriculturePermit removeBygetAgriculturePermitBy_PermitNum(
			String pirPermtNumber)
		throws NoSuchAgriculturePermitException;

	/**
	 * Returns the number of agriculture permits where pirPermtNumber = &#63;.
	 *
	 * @param pirPermtNumber the pir permt number
	 * @return the number of matching agriculture permits
	 */
	public int countBygetAgriculturePermitBy_PermitNum(String pirPermtNumber);

	/**
	 * Caches the agriculture permit in the entity cache if it is enabled.
	 *
	 * @param agriculturePermit the agriculture permit
	 */
	public void cacheResult(AgriculturePermit agriculturePermit);

	/**
	 * Caches the agriculture permits in the entity cache if it is enabled.
	 *
	 * @param agriculturePermits the agriculture permits
	 */
	public void cacheResult(
		java.util.List<AgriculturePermit> agriculturePermits);

	/**
	 * Creates a new agriculture permit with the primary key. Does not add the agriculture permit to the database.
	 *
	 * @param agriculturePermitId the primary key for the new agriculture permit
	 * @return the new agriculture permit
	 */
	public AgriculturePermit create(long agriculturePermitId);

	/**
	 * Removes the agriculture permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit that was removed
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	public AgriculturePermit remove(long agriculturePermitId)
		throws NoSuchAgriculturePermitException;

	public AgriculturePermit updateImpl(AgriculturePermit agriculturePermit);

	/**
	 * Returns the agriculture permit with the primary key or throws a <code>NoSuchAgriculturePermitException</code> if it could not be found.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit
	 * @throws NoSuchAgriculturePermitException if a agriculture permit with the primary key could not be found
	 */
	public AgriculturePermit findByPrimaryKey(long agriculturePermitId)
		throws NoSuchAgriculturePermitException;

	/**
	 * Returns the agriculture permit with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriculturePermitId the primary key of the agriculture permit
	 * @return the agriculture permit, or <code>null</code> if a agriculture permit with the primary key could not be found
	 */
	public AgriculturePermit fetchByPrimaryKey(long agriculturePermitId);

	/**
	 * Returns all the agriculture permits.
	 *
	 * @return the agriculture permits
	 */
	public java.util.List<AgriculturePermit> findAll();

	/**
	 * Returns a range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @return the range of agriculture permits
	 */
	public java.util.List<AgriculturePermit> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture permits
	 */
	public java.util.List<AgriculturePermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
			orderByComparator);

	/**
	 * Returns an ordered range of all the agriculture permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture permits
	 * @param end the upper bound of the range of agriculture permits (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture permits
	 */
	public java.util.List<AgriculturePermit> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AgriculturePermit>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the agriculture permits from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of agriculture permits.
	 *
	 * @return the number of agriculture permits
	 */
	public int countAll();

}