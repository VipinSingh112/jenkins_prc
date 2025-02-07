/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.hsra.stage.services.exception.NoSuchHSRAApplicationLicenseIssuanceException;
import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance;
import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuanceTable;
import com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceImpl;
import com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceModelImpl;
import com.nbp.hsra.stage.services.service.persistence.HSRAApplicationLicenseIssuancePersistence;
import com.nbp.hsra.stage.services.service.persistence.HSRAApplicationLicenseIssuanceUtil;
import com.nbp.hsra.stage.services.service.persistence.impl.constants.HSRA_STAGEPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the hsra application license issuance service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HSRAApplicationLicenseIssuancePersistence.class)
public class HSRAApplicationLicenseIssuancePersistenceImpl
	extends BasePersistenceImpl<HSRAApplicationLicenseIssuance>
	implements HSRAApplicationLicenseIssuancePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HSRAApplicationLicenseIssuanceUtil</code> to access the hsra application license issuance persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HSRAApplicationLicenseIssuanceImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHSRA_lic_iss_By_CI;
	private FinderPath _finderPathCountBygetHSRA_lic_iss_By_CI;

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_CI(
			String caseId)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			fetchBygetHSRA_lic_iss_By_CI(caseId);

		if (hsraApplicationLicenseIssuance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHSRAApplicationLicenseIssuanceException(
				sb.toString());
		}

		return hsraApplicationLicenseIssuance;
	}

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CI(
		String caseId) {

		return fetchBygetHSRA_lic_iss_By_CI(caseId, true);
	}

	/**
	 * Returns the hsra application license issuance where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHSRA_lic_iss_By_CI, finderArgs, this);
		}

		if (result instanceof HSRAApplicationLicenseIssuance) {
			HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
				(HSRAApplicationLicenseIssuance)result;

			if (!Objects.equals(
					caseId, hsraApplicationLicenseIssuance.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<HSRAApplicationLicenseIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHSRA_lic_iss_By_CI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"HSRAApplicationLicenseIssuancePersistenceImpl.fetchBygetHSRA_lic_iss_By_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HSRAApplicationLicenseIssuance
						hsraApplicationLicenseIssuance = list.get(0);

					result = hsraApplicationLicenseIssuance;

					cacheResult(hsraApplicationLicenseIssuance);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (HSRAApplicationLicenseIssuance)result;
		}
	}

	/**
	 * Removes the hsra application license issuance where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application license issuance that was removed
	 */
	@Override
	public HSRAApplicationLicenseIssuance removeBygetHSRA_lic_iss_By_CI(
			String caseId)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			findBygetHSRA_lic_iss_By_CI(caseId);

		return remove(hsraApplicationLicenseIssuance);
	}

	/**
	 * Returns the number of hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application license issuances
	 */
	@Override
	public int countBygetHSRA_lic_iss_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHSRA_lic_iss_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CI_CASEID_2 =
		"hsraApplicationLicenseIssuance.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CI_CASEID_3 =
		"(hsraApplicationLicenseIssuance.caseId IS NULL OR hsraApplicationLicenseIssuance.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetHSRA_lic_iss_By_CID;
	private FinderPath _finderPathWithoutPaginationFindBygetHSRA_lic_iss_By_CID;
	private FinderPath _finderPathCountBygetHSRA_lic_iss_By_CID;

	/**
	 * Returns all the hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application license issuances
	 */
	@Override
	public List<HSRAApplicationLicenseIssuance> findBygetHSRA_lic_iss_By_CID(
		String caseId) {

		return findBygetHSRA_lic_iss_By_CID(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @return the range of matching hsra application license issuances
	 */
	@Override
	public List<HSRAApplicationLicenseIssuance> findBygetHSRA_lic_iss_By_CID(
		String caseId, int start, int end) {

		return findBygetHSRA_lic_iss_By_CID(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application license issuances
	 */
	@Override
	public List<HSRAApplicationLicenseIssuance> findBygetHSRA_lic_iss_By_CID(
		String caseId, int start, int end,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator) {

		return findBygetHSRA_lic_iss_By_CID(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application license issuances where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application license issuances
	 */
	@Override
	public List<HSRAApplicationLicenseIssuance> findBygetHSRA_lic_iss_By_CID(
		String caseId, int start, int end,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHSRA_lic_iss_By_CID;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHSRA_lic_iss_By_CID;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<HSRAApplicationLicenseIssuance> list = null;

		if (useFinderCache) {
			list = (List<HSRAApplicationLicenseIssuance>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HSRAApplicationLicenseIssuance
						hsraApplicationLicenseIssuance : list) {

					if (!caseId.equals(
							hsraApplicationLicenseIssuance.getCaseId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					HSRAApplicationLicenseIssuanceModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<HSRAApplicationLicenseIssuance>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_CID_First(
			String caseId,
			OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			fetchBygetHSRA_lic_iss_By_CID_First(caseId, orderByComparator);

		if (hsraApplicationLicenseIssuance != null) {
			return hsraApplicationLicenseIssuance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHSRAApplicationLicenseIssuanceException(sb.toString());
	}

	/**
	 * Returns the first hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CID_First(
		String caseId,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator) {

		List<HSRAApplicationLicenseIssuance> list =
			findBygetHSRA_lic_iss_By_CID(caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_CID_Last(
			String caseId,
			OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			fetchBygetHSRA_lic_iss_By_CID_Last(caseId, orderByComparator);

		if (hsraApplicationLicenseIssuance != null) {
			return hsraApplicationLicenseIssuance;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHSRAApplicationLicenseIssuanceException(sb.toString());
	}

	/**
	 * Returns the last hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_CID_Last(
		String caseId,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator) {

		int count = countBygetHSRA_lic_iss_By_CID(caseId);

		if (count == 0) {
			return null;
		}

		List<HSRAApplicationLicenseIssuance> list =
			findBygetHSRA_lic_iss_By_CID(
				caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra application license issuances before and after the current hsra application license issuance in the ordered set where caseId = &#63;.
	 *
	 * @param hsraFullLicenseId the primary key of the current hsra application license issuance
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance[]
			findBygetHSRA_lic_iss_By_CID_PrevAndNext(
				long hsraFullLicenseId, String caseId,
				OrderByComparator<HSRAApplicationLicenseIssuance>
					orderByComparator)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		caseId = Objects.toString(caseId, "");

		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			findByPrimaryKey(hsraFullLicenseId);

		Session session = null;

		try {
			session = openSession();

			HSRAApplicationLicenseIssuance[] array =
				new HSRAApplicationLicenseIssuanceImpl[3];

			array[0] = getBygetHSRA_lic_iss_By_CID_PrevAndNext(
				session, hsraApplicationLicenseIssuance, caseId,
				orderByComparator, true);

			array[1] = hsraApplicationLicenseIssuance;

			array[2] = getBygetHSRA_lic_iss_By_CID_PrevAndNext(
				session, hsraApplicationLicenseIssuance, caseId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected HSRAApplicationLicenseIssuance
		getBygetHSRA_lic_iss_By_CID_PrevAndNext(
			Session session,
			HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance,
			String caseId,
			OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CID_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(HSRAApplicationLicenseIssuanceModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraApplicationLicenseIssuance)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HSRAApplicationLicenseIssuance> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra application license issuances where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetHSRA_lic_iss_By_CID(String caseId) {
		for (HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance :
				findBygetHSRA_lic_iss_By_CID(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplicationLicenseIssuance);
		}
	}

	/**
	 * Returns the number of hsra application license issuances where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application license issuances
	 */
	@Override
	public int countBygetHSRA_lic_iss_By_CID(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHSRA_lic_iss_By_CID;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CID_CASEID_2 =
		"hsraApplicationLicenseIssuance.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRA_LIC_ISS_BY_CID_CASEID_3 =
		"(hsraApplicationLicenseIssuance.caseId IS NULL OR hsraApplicationLicenseIssuance.caseId = '')";

	private FinderPath _finderPathFetchBygetHSRA_lic_iss_By_LN;
	private FinderPath _finderPathCountBygetHSRA_lic_iss_By_LN;

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param licenseNumber the license number
	 * @return the matching hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance findBygetHSRA_lic_iss_By_LN(
			String licenseNumber)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			fetchBygetHSRA_lic_iss_By_LN(licenseNumber);

		if (hsraApplicationLicenseIssuance == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("licenseNumber=");
			sb.append(licenseNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHSRAApplicationLicenseIssuanceException(
				sb.toString());
		}

		return hsraApplicationLicenseIssuance;
	}

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_LN(
		String licenseNumber) {

		return fetchBygetHSRA_lic_iss_By_LN(licenseNumber, true);
	}

	/**
	 * Returns the hsra application license issuance where licenseNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param licenseNumber the license number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application license issuance, or <code>null</code> if a matching hsra application license issuance could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance fetchBygetHSRA_lic_iss_By_LN(
		String licenseNumber, boolean useFinderCache) {

		licenseNumber = Objects.toString(licenseNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {licenseNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHSRA_lic_iss_By_LN, finderArgs, this);
		}

		if (result instanceof HSRAApplicationLicenseIssuance) {
			HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
				(HSRAApplicationLicenseIssuance)result;

			if (!Objects.equals(
					licenseNumber,
					hsraApplicationLicenseIssuance.getLicenseNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE);

			boolean bindLicenseNumber = false;

			if (licenseNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_LN_LICENSENUMBER_3);
			}
			else {
				bindLicenseNumber = true;

				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_LN_LICENSENUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLicenseNumber) {
					queryPos.add(licenseNumber);
				}

				List<HSRAApplicationLicenseIssuance> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHSRA_lic_iss_By_LN, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {licenseNumber};
							}

							_log.warn(
								"HSRAApplicationLicenseIssuancePersistenceImpl.fetchBygetHSRA_lic_iss_By_LN(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HSRAApplicationLicenseIssuance
						hsraApplicationLicenseIssuance = list.get(0);

					result = hsraApplicationLicenseIssuance;

					cacheResult(hsraApplicationLicenseIssuance);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (HSRAApplicationLicenseIssuance)result;
		}
	}

	/**
	 * Removes the hsra application license issuance where licenseNumber = &#63; from the database.
	 *
	 * @param licenseNumber the license number
	 * @return the hsra application license issuance that was removed
	 */
	@Override
	public HSRAApplicationLicenseIssuance removeBygetHSRA_lic_iss_By_LN(
			String licenseNumber)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			findBygetHSRA_lic_iss_By_LN(licenseNumber);

		return remove(hsraApplicationLicenseIssuance);
	}

	/**
	 * Returns the number of hsra application license issuances where licenseNumber = &#63;.
	 *
	 * @param licenseNumber the license number
	 * @return the number of matching hsra application license issuances
	 */
	@Override
	public int countBygetHSRA_lic_iss_By_LN(String licenseNumber) {
		licenseNumber = Objects.toString(licenseNumber, "");

		FinderPath finderPath = _finderPathCountBygetHSRA_lic_iss_By_LN;

		Object[] finderArgs = new Object[] {licenseNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE);

			boolean bindLicenseNumber = false;

			if (licenseNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_LN_LICENSENUMBER_3);
			}
			else {
				bindLicenseNumber = true;

				sb.append(_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_LN_LICENSENUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindLicenseNumber) {
					queryPos.add(licenseNumber);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_LN_LICENSENUMBER_2 =
			"hsraApplicationLicenseIssuance.licenseNumber = ?";

	private static final String
		_FINDER_COLUMN_GETHSRA_LIC_ISS_BY_LN_LICENSENUMBER_3 =
			"(hsraApplicationLicenseIssuance.licenseNumber IS NULL OR hsraApplicationLicenseIssuance.licenseNumber = '')";

	public HSRAApplicationLicenseIssuancePersistenceImpl() {
		setModelClass(HSRAApplicationLicenseIssuance.class);

		setModelImplClass(HSRAApplicationLicenseIssuanceImpl.class);
		setModelPKClass(long.class);

		setTable(HSRAApplicationLicenseIssuanceTable.INSTANCE);
	}

	/**
	 * Caches the hsra application license issuance in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 */
	@Override
	public void cacheResult(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		entityCache.putResult(
			HSRAApplicationLicenseIssuanceImpl.class,
			hsraApplicationLicenseIssuance.getPrimaryKey(),
			hsraApplicationLicenseIssuance);

		finderCache.putResult(
			_finderPathFetchBygetHSRA_lic_iss_By_CI,
			new Object[] {hsraApplicationLicenseIssuance.getCaseId()},
			hsraApplicationLicenseIssuance);

		finderCache.putResult(
			_finderPathFetchBygetHSRA_lic_iss_By_LN,
			new Object[] {hsraApplicationLicenseIssuance.getLicenseNumber()},
			hsraApplicationLicenseIssuance);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra application license issuances in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationLicenseIssuances the hsra application license issuances
	 */
	@Override
	public void cacheResult(
		List<HSRAApplicationLicenseIssuance> hsraApplicationLicenseIssuances) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraApplicationLicenseIssuances.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance :
				hsraApplicationLicenseIssuances) {

			if (entityCache.getResult(
					HSRAApplicationLicenseIssuanceImpl.class,
					hsraApplicationLicenseIssuance.getPrimaryKey()) == null) {

				cacheResult(hsraApplicationLicenseIssuance);
			}
		}
	}

	/**
	 * Clears the cache for all hsra application license issuances.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HSRAApplicationLicenseIssuanceImpl.class);

		finderCache.clearCache(HSRAApplicationLicenseIssuanceImpl.class);
	}

	/**
	 * Clears the cache for the hsra application license issuance.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		entityCache.removeResult(
			HSRAApplicationLicenseIssuanceImpl.class,
			hsraApplicationLicenseIssuance);
	}

	@Override
	public void clearCache(
		List<HSRAApplicationLicenseIssuance> hsraApplicationLicenseIssuances) {

		for (HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance :
				hsraApplicationLicenseIssuances) {

			entityCache.removeResult(
				HSRAApplicationLicenseIssuanceImpl.class,
				hsraApplicationLicenseIssuance);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HSRAApplicationLicenseIssuanceImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HSRAApplicationLicenseIssuanceImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HSRAApplicationLicenseIssuanceModelImpl
			hsraApplicationLicenseIssuanceModelImpl) {

		Object[] args = new Object[] {
			hsraApplicationLicenseIssuanceModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetHSRA_lic_iss_By_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHSRA_lic_iss_By_CI, args,
			hsraApplicationLicenseIssuanceModelImpl);

		args = new Object[] {
			hsraApplicationLicenseIssuanceModelImpl.getLicenseNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetHSRA_lic_iss_By_LN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHSRA_lic_iss_By_LN, args,
			hsraApplicationLicenseIssuanceModelImpl);
	}

	/**
	 * Creates a new hsra application license issuance with the primary key. Does not add the hsra application license issuance to the database.
	 *
	 * @param hsraFullLicenseId the primary key for the new hsra application license issuance
	 * @return the new hsra application license issuance
	 */
	@Override
	public HSRAApplicationLicenseIssuance create(long hsraFullLicenseId) {
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			new HSRAApplicationLicenseIssuanceImpl();

		hsraApplicationLicenseIssuance.setNew(true);
		hsraApplicationLicenseIssuance.setPrimaryKey(hsraFullLicenseId);

		hsraApplicationLicenseIssuance.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return hsraApplicationLicenseIssuance;
	}

	/**
	 * Removes the hsra application license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance that was removed
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance remove(long hsraFullLicenseId)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		return remove((Serializable)hsraFullLicenseId);
	}

	/**
	 * Removes the hsra application license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra application license issuance
	 * @return the hsra application license issuance that was removed
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance remove(Serializable primaryKey)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		Session session = null;

		try {
			session = openSession();

			HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
				(HSRAApplicationLicenseIssuance)session.get(
					HSRAApplicationLicenseIssuanceImpl.class, primaryKey);

			if (hsraApplicationLicenseIssuance == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHSRAApplicationLicenseIssuanceException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraApplicationLicenseIssuance);
		}
		catch (NoSuchHSRAApplicationLicenseIssuanceException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected HSRAApplicationLicenseIssuance removeImpl(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraApplicationLicenseIssuance)) {
				hsraApplicationLicenseIssuance =
					(HSRAApplicationLicenseIssuance)session.get(
						HSRAApplicationLicenseIssuanceImpl.class,
						hsraApplicationLicenseIssuance.getPrimaryKeyObj());
			}

			if (hsraApplicationLicenseIssuance != null) {
				session.delete(hsraApplicationLicenseIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraApplicationLicenseIssuance != null) {
			clearCache(hsraApplicationLicenseIssuance);
		}

		return hsraApplicationLicenseIssuance;
	}

	@Override
	public HSRAApplicationLicenseIssuance updateImpl(
		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		boolean isNew = hsraApplicationLicenseIssuance.isNew();

		if (!(hsraApplicationLicenseIssuance instanceof
				HSRAApplicationLicenseIssuanceModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					hsraApplicationLicenseIssuance.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraApplicationLicenseIssuance);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraApplicationLicenseIssuance proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HSRAApplicationLicenseIssuance implementation " +
					hsraApplicationLicenseIssuance.getClass());
		}

		HSRAApplicationLicenseIssuanceModelImpl
			hsraApplicationLicenseIssuanceModelImpl =
				(HSRAApplicationLicenseIssuanceModelImpl)
					hsraApplicationLicenseIssuance;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraApplicationLicenseIssuance.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraApplicationLicenseIssuance.setCreateDate(date);
			}
			else {
				hsraApplicationLicenseIssuance.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraApplicationLicenseIssuanceModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraApplicationLicenseIssuance.setModifiedDate(date);
			}
			else {
				hsraApplicationLicenseIssuance.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraApplicationLicenseIssuance);
			}
			else {
				hsraApplicationLicenseIssuance =
					(HSRAApplicationLicenseIssuance)session.merge(
						hsraApplicationLicenseIssuance);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HSRAApplicationLicenseIssuanceImpl.class,
			hsraApplicationLicenseIssuanceModelImpl, false, true);

		cacheUniqueFindersCache(hsraApplicationLicenseIssuanceModelImpl);

		if (isNew) {
			hsraApplicationLicenseIssuance.setNew(false);
		}

		hsraApplicationLicenseIssuance.resetOriginalValues();

		return hsraApplicationLicenseIssuance;
	}

	/**
	 * Returns the hsra application license issuance with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra application license issuance
	 * @return the hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance =
			fetchByPrimaryKey(primaryKey);

		if (hsraApplicationLicenseIssuance == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHSRAApplicationLicenseIssuanceException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraApplicationLicenseIssuance;
	}

	/**
	 * Returns the hsra application license issuance with the primary key or throws a <code>NoSuchHSRAApplicationLicenseIssuanceException</code> if it could not be found.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance
	 * @throws NoSuchHSRAApplicationLicenseIssuanceException if a hsra application license issuance with the primary key could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance findByPrimaryKey(
			long hsraFullLicenseId)
		throws NoSuchHSRAApplicationLicenseIssuanceException {

		return findByPrimaryKey((Serializable)hsraFullLicenseId);
	}

	/**
	 * Returns the hsra application license issuance with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance, or <code>null</code> if a hsra application license issuance with the primary key could not be found
	 */
	@Override
	public HSRAApplicationLicenseIssuance fetchByPrimaryKey(
		long hsraFullLicenseId) {

		return fetchByPrimaryKey((Serializable)hsraFullLicenseId);
	}

	/**
	 * Returns all the hsra application license issuances.
	 *
	 * @return the hsra application license issuances
	 */
	@Override
	public List<HSRAApplicationLicenseIssuance> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @return the range of hsra application license issuances
	 */
	@Override
	public List<HSRAApplicationLicenseIssuance> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application license issuances
	 */
	@Override
	public List<HSRAApplicationLicenseIssuance> findAll(
		int start, int end,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application license issuances
	 */
	@Override
	public List<HSRAApplicationLicenseIssuance> findAll(
		int start, int end,
		OrderByComparator<HSRAApplicationLicenseIssuance> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<HSRAApplicationLicenseIssuance> list = null;

		if (useFinderCache) {
			list = (List<HSRAApplicationLicenseIssuance>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE;

				sql = sql.concat(
					HSRAApplicationLicenseIssuanceModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HSRAApplicationLicenseIssuance>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the hsra application license issuances from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance :
				findAll()) {

			remove(hsraApplicationLicenseIssuance);
		}
	}

	/**
	 * Returns the number of hsra application license issuances.
	 *
	 * @return the number of hsra application license issuances
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_HSRAAPPLICATIONLICENSEISSUANCE);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "hsraFullLicenseId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HSRAApplicationLicenseIssuanceModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra application license issuance persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathFetchBygetHSRA_lic_iss_By_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHSRA_lic_iss_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHSRA_lic_iss_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHSRA_lic_iss_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetHSRA_lic_iss_By_CID = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetHSRA_lic_iss_By_CID",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetHSRA_lic_iss_By_CID =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetHSRA_lic_iss_By_CID",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetHSRA_lic_iss_By_CID = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHSRA_lic_iss_By_CID",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetHSRA_lic_iss_By_LN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHSRA_lic_iss_By_LN",
			new String[] {String.class.getName()},
			new String[] {"licenseNumber"}, true);

		_finderPathCountBygetHSRA_lic_iss_By_LN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHSRA_lic_iss_By_LN",
			new String[] {String.class.getName()},
			new String[] {"licenseNumber"}, false);

		HSRAApplicationLicenseIssuanceUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HSRAApplicationLicenseIssuanceUtil.setPersistence(null);

		entityCache.removeCache(
			HSRAApplicationLicenseIssuanceImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE =
		"SELECT hsraApplicationLicenseIssuance FROM HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance";

	private static final String
		_SQL_SELECT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE =
			"SELECT hsraApplicationLicenseIssuance FROM HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance WHERE ";

	private static final String _SQL_COUNT_HSRAAPPLICATIONLICENSEISSUANCE =
		"SELECT COUNT(hsraApplicationLicenseIssuance) FROM HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance";

	private static final String
		_SQL_COUNT_HSRAAPPLICATIONLICENSEISSUANCE_WHERE =
			"SELECT COUNT(hsraApplicationLicenseIssuance) FROM HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"hsraApplicationLicenseIssuance.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HSRAApplicationLicenseIssuance exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HSRAApplicationLicenseIssuance exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HSRAApplicationLicenseIssuancePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}