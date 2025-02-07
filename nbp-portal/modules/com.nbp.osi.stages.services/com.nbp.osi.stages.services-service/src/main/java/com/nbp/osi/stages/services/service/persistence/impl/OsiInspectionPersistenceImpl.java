/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service.persistence.impl;

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

import com.nbp.osi.stages.services.exception.NoSuchOsiInspectionException;
import com.nbp.osi.stages.services.model.OsiInspection;
import com.nbp.osi.stages.services.model.OsiInspectionTable;
import com.nbp.osi.stages.services.model.impl.OsiInspectionImpl;
import com.nbp.osi.stages.services.model.impl.OsiInspectionModelImpl;
import com.nbp.osi.stages.services.service.persistence.OsiInspectionPersistence;
import com.nbp.osi.stages.services.service.persistence.OsiInspectionUtil;
import com.nbp.osi.stages.services.service.persistence.impl.constants.OSI_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiInspectionPersistence.class)
public class OsiInspectionPersistenceImpl
	extends BasePersistenceImpl<OsiInspection>
	implements OsiInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiInspectionUtil</code> to access the osi inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetOsiInspectionBy_CI;
	private FinderPath _finderPathCountBygetOsiInspectionBy_CI;

	/**
	 * Returns the osi inspection where caseId = &#63; or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOsiInspectionBy_CI(String caseId)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOsiInspectionBy_CI(caseId);

		if (osiInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInspectionException(sb.toString());
		}

		return osiInspection;
	}

	/**
	 * Returns the osi inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOsiInspectionBy_CI(String caseId) {
		return fetchBygetOsiInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the osi inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOsiInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof OsiInspection) {
			OsiInspection osiInspection = (OsiInspection)result;

			if (!Objects.equals(caseId, osiInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSIINSPECTIONBY_CI_CASEID_2);
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

				List<OsiInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiInspectionBy_CI, finderArgs,
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
								"OsiInspectionPersistenceImpl.fetchBygetOsiInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInspection osiInspection = list.get(0);

					result = osiInspection;

					cacheResult(osiInspection);
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
			return (OsiInspection)result;
		}
	}

	/**
	 * Removes the osi inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi inspection that was removed
	 */
	@Override
	public OsiInspection removeBygetOsiInspectionBy_CI(String caseId)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = findBygetOsiInspectionBy_CI(caseId);

		return remove(osiInspection);
	}

	/**
	 * Returns the number of osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	@Override
	public int countBygetOsiInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOsiInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSIINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSIINSPECTIONBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOSIINSPECTIONBY_CI_CASEID_2 =
		"osiInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETOSIINSPECTIONBY_CI_CASEID_3 =
		"(osiInspection.caseId IS NULL OR osiInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetOSI_OAI;
	private FinderPath _finderPathWithoutPaginationFindBygetOSI_OAI;
	private FinderPath _finderPathCountBygetOSI_OAI;

	/**
	 * Returns all the osi inspections where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_OAI(long osiApplicationId) {
		return findBygetOSI_OAI(
			osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end) {

		return findBygetOSI_OAI(osiApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return findBygetOSI_OAI(
			osiApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi inspections where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_OAI(
		long osiApplicationId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOSI_OAI;
				finderArgs = new Object[] {osiApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOSI_OAI;
			finderArgs = new Object[] {
				osiApplicationId, start, end, orderByComparator
			};
		}

		List<OsiInspection> list = null;

		if (useFinderCache) {
			list = (List<OsiInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInspection osiInspection : list) {
					if (osiApplicationId !=
							osiInspection.getOsiApplicationId()) {

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

			sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSI_OAI_OSIAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

				list = (List<OsiInspection>)QueryUtil.list(
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
	 * Returns the first osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOSI_OAI_First(
			long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOSI_OAI_First(
			osiApplicationId, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the first osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOSI_OAI_First(
		long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator) {

		List<OsiInspection> list = findBygetOSI_OAI(
			osiApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOSI_OAI_Last(
			long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOSI_OAI_Last(
			osiApplicationId, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the last osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOSI_OAI_Last(
		long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator) {

		int count = countBygetOSI_OAI(osiApplicationId);

		if (count == 0) {
			return null;
		}

		List<OsiInspection> list = findBygetOSI_OAI(
			osiApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection[] findBygetOSI_OAI_PrevAndNext(
			long osiInspectionId, long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = findByPrimaryKey(osiInspectionId);

		Session session = null;

		try {
			session = openSession();

			OsiInspection[] array = new OsiInspectionImpl[3];

			array[0] = getBygetOSI_OAI_PrevAndNext(
				session, osiInspection, osiApplicationId, orderByComparator,
				true);

			array[1] = osiInspection;

			array[2] = getBygetOSI_OAI_PrevAndNext(
				session, osiInspection, osiApplicationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiInspection getBygetOSI_OAI_PrevAndNext(
		Session session, OsiInspection osiInspection, long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSI_OAI_OSIAPPLICATIONID_2);

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
			sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi inspections where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	@Override
	public void removeBygetOSI_OAI(long osiApplicationId) {
		for (OsiInspection osiInspection :
				findBygetOSI_OAI(
					osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiInspection);
		}
	}

	/**
	 * Returns the number of osi inspections where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	@Override
	public int countBygetOSI_OAI(long osiApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOSI_OAI;

		Object[] finderArgs = new Object[] {osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSI_OAI_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiApplicationId);

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

	private static final String _FINDER_COLUMN_GETOSI_OAI_OSIAPPLICATIONID_2 =
		"osiInspection.osiApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetOSI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetOSI_CaseId;
	private FinderPath _finderPathCountBygetOSI_CaseId;

	/**
	 * Returns all the osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseId(String caseId) {
		return findBygetOSI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end) {

		return findBygetOSI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return findBygetOSI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOSI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOSI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<OsiInspection> list = null;

		if (useFinderCache) {
			list = (List<OsiInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInspection osiInspection : list) {
					if (!caseId.equals(osiInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiInspection>)QueryUtil.list(
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
	 * Returns the first osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOSI_CaseId_First(
			String caseId, OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOSI_CaseId_First(
			caseId, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the first osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOSI_CaseId_First(
		String caseId, OrderByComparator<OsiInspection> orderByComparator) {

		List<OsiInspection> list = findBygetOSI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOSI_CaseId_Last(
			String caseId, OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOSI_CaseId_Last(
			caseId, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the last osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOSI_CaseId_Last(
		String caseId, OrderByComparator<OsiInspection> orderByComparator) {

		int count = countBygetOSI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<OsiInspection> list = findBygetOSI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where caseId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection[] findBygetOSI_CaseId_PrevAndNext(
			long osiInspectionId, String caseId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		caseId = Objects.toString(caseId, "");

		OsiInspection osiInspection = findByPrimaryKey(osiInspectionId);

		Session session = null;

		try {
			session = openSession();

			OsiInspection[] array = new OsiInspectionImpl[3];

			array[0] = getBygetOSI_CaseId_PrevAndNext(
				session, osiInspection, caseId, orderByComparator, true);

			array[1] = osiInspection;

			array[2] = getBygetOSI_CaseId_PrevAndNext(
				session, osiInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiInspection getBygetOSI_CaseId_PrevAndNext(
		Session session, OsiInspection osiInspection, String caseId,
		OrderByComparator<OsiInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOSI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETOSI_CASEID_CASEID_2);
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
			sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
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
						osiInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetOSI_CaseId(String caseId) {
		for (OsiInspection osiInspection :
				findBygetOSI_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiInspection);
		}
	}

	/**
	 * Returns the number of osi inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	@Override
	public int countBygetOSI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSI_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOSI_CASEID_CASEID_2 =
		"osiInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETOSI_CASEID_CASEID_3 =
		"(osiInspection.caseId IS NULL OR osiInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetMI_Status;
	private FinderPath _finderPathCountBygetMI_Status;

	/**
	 * Returns all the osi inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetMI_Status(String status) {
		return findBygetMI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetMI_Status(
		String status, int start, int end) {

		return findBygetMI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return findBygetMI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetMI_Status(
		String status, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<OsiInspection> list = null;

		if (useFinderCache) {
			list = (List<OsiInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInspection osiInspection : list) {
					if (!status.equals(osiInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list = (List<OsiInspection>)QueryUtil.list(
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
	 * Returns the first osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetMI_Status_First(
			String status, OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetMI_Status_First(
			status, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetMI_Status_First(
		String status, OrderByComparator<OsiInspection> orderByComparator) {

		List<OsiInspection> list = findBygetMI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetMI_Status_Last(
			String status, OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetMI_Status_Last(
			status, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetMI_Status_Last(
		String status, OrderByComparator<OsiInspection> orderByComparator) {

		int count = countBygetMI_Status(status);

		if (count == 0) {
			return null;
		}

		List<OsiInspection> list = findBygetMI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection[] findBygetMI_Status_PrevAndNext(
			long osiInspectionId, String status,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		status = Objects.toString(status, "");

		OsiInspection osiInspection = findByPrimaryKey(osiInspectionId);

		Session session = null;

		try {
			session = openSession();

			OsiInspection[] array = new OsiInspectionImpl[3];

			array[0] = getBygetMI_Status_PrevAndNext(
				session, osiInspection, status, orderByComparator, true);

			array[1] = osiInspection;

			array[2] = getBygetMI_Status_PrevAndNext(
				session, osiInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiInspection getBygetMI_Status_PrevAndNext(
		Session session, OsiInspection osiInspection, String status,
		OrderByComparator<OsiInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
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
			sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetMI_Status(String status) {
		for (OsiInspection osiInspection :
				findBygetMI_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiInspection);
		}
	}

	/**
	 * Returns the number of osi inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi inspections
	 */
	@Override
	public int countBygetMI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetMI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSIINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETMI_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
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

	private static final String _FINDER_COLUMN_GETMI_STATUS_STATUS_2 =
		"osiInspection.status = ?";

	private static final String _FINDER_COLUMN_GETMI_STATUS_STATUS_3 =
		"(osiInspection.status IS NULL OR osiInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetOSI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetOSI_CaseIdStatus;
	private FinderPath _finderPathCountBygetOSI_CaseIdStatus;

	/**
	 * Returns all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId) {

		return findBygetOSI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetOSI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return findBygetOSI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOSI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<OsiInspection> list = null;

		if (useFinderCache) {
			list = (List<OsiInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInspection osiInspection : list) {
					if (!status.equals(osiInspection.getStatus()) ||
						!caseId.equals(osiInspection.getCaseId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<OsiInspection>)QueryUtil.list(
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
	 * Returns the first osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOSI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOSI_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOSI_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<OsiInspection> orderByComparator) {

		List<OsiInspection> list = findBygetOSI_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOSI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOSI_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOSI_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<OsiInspection> orderByComparator) {

		int count = countBygetOSI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<OsiInspection> list = findBygetOSI_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection[] findBygetOSI_CaseIdStatus_PrevAndNext(
			long osiInspectionId, String status, String caseId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		OsiInspection osiInspection = findByPrimaryKey(osiInspectionId);

		Session session = null;

		try {
			session = openSession();

			OsiInspection[] array = new OsiInspectionImpl[3];

			array[0] = getBygetOSI_CaseIdStatus_PrevAndNext(
				session, osiInspection, status, caseId, orderByComparator,
				true);

			array[1] = osiInspection;

			array[2] = getBygetOSI_CaseIdStatus_PrevAndNext(
				session, osiInspection, status, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OsiInspection getBygetOSI_CaseIdStatus_PrevAndNext(
		Session session, OsiInspection osiInspection, String status,
		String caseId, OrderByComparator<OsiInspection> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_CASEID_2);
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
			sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetOSI_CaseIdStatus(String status, String caseId) {
		for (OsiInspection osiInspection :
				findBygetOSI_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiInspection);
		}
	}

	/**
	 * Returns the number of osi inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching osi inspections
	 */
	@Override
	public int countBygetOSI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSI_CASEIDSTATUS_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

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

	private static final String _FINDER_COLUMN_GETOSI_CASEIDSTATUS_STATUS_2 =
		"osiInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETOSI_CASEIDSTATUS_STATUS_3 =
		"(osiInspection.status IS NULL OR osiInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETOSI_CASEIDSTATUS_CASEID_2 =
		"osiInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETOSI_CASEIDSTATUS_CASEID_3 =
		"(osiInspection.caseId IS NULL OR osiInspection.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetOSI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOSI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetOSI_CaseIdApplicationId;

	/**
	 * Returns all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId) {

		return findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end) {

		return findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi inspections
	 */
	@Override
	public List<OsiInspection> findBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId, int start, int end,
		OrderByComparator<OsiInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSI_CaseIdApplicationId;
				finderArgs = new Object[] {status, osiApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOSI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, osiApplicationId, start, end, orderByComparator
			};
		}

		List<OsiInspection> list = null;

		if (useFinderCache) {
			list = (List<OsiInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiInspection osiInspection : list) {
					if (!status.equals(osiInspection.getStatus()) ||
						(osiApplicationId !=
							osiInspection.getOsiApplicationId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_OSIAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(osiApplicationId);

				list = (List<OsiInspection>)QueryUtil.list(
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
	 * Returns the first osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOSI_CaseIdApplicationId_First(
			String status, long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOSI_CaseIdApplicationId_First(
			status, osiApplicationId, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the first osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOSI_CaseIdApplicationId_First(
		String status, long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator) {

		List<OsiInspection> list = findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetOSI_CaseIdApplicationId_Last(
			String status, long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchBygetOSI_CaseIdApplicationId_Last(
			status, osiApplicationId, orderByComparator);

		if (osiInspection != null) {
			return osiInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", osiApplicationId=");
		sb.append(osiApplicationId);

		sb.append("}");

		throw new NoSuchOsiInspectionException(sb.toString());
	}

	/**
	 * Returns the last osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetOSI_CaseIdApplicationId_Last(
		String status, long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator) {

		int count = countBygetOSI_CaseIdApplicationId(status, osiApplicationId);

		if (count == 0) {
			return null;
		}

		List<OsiInspection> list = findBygetOSI_CaseIdApplicationId(
			status, osiApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi inspections before and after the current osi inspection in the ordered set where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param osiInspectionId the primary key of the current osi inspection
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection[] findBygetOSI_CaseIdApplicationId_PrevAndNext(
			long osiInspectionId, String status, long osiApplicationId,
			OrderByComparator<OsiInspection> orderByComparator)
		throws NoSuchOsiInspectionException {

		status = Objects.toString(status, "");

		OsiInspection osiInspection = findByPrimaryKey(osiInspectionId);

		Session session = null;

		try {
			session = openSession();

			OsiInspection[] array = new OsiInspectionImpl[3];

			array[0] = getBygetOSI_CaseIdApplicationId_PrevAndNext(
				session, osiInspection, status, osiApplicationId,
				orderByComparator, true);

			array[1] = osiInspection;

			array[2] = getBygetOSI_CaseIdApplicationId_PrevAndNext(
				session, osiInspection, status, osiApplicationId,
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

	protected OsiInspection getBygetOSI_CaseIdApplicationId_PrevAndNext(
		Session session, OsiInspection osiInspection, String status,
		long osiApplicationId,
		OrderByComparator<OsiInspection> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_OSIAPPLICATIONID_2);

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
			sb.append(OsiInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(osiApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						osiInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi inspections where status = &#63; and osiApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 */
	@Override
	public void removeBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId) {

		for (OsiInspection osiInspection :
				findBygetOSI_CaseIdApplicationId(
					status, osiApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(osiInspection);
		}
	}

	/**
	 * Returns the number of osi inspections where status = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	@Override
	public int countBygetOSI_CaseIdApplicationId(
		String status, long osiApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetOSI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, osiApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSIINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(osiApplicationId);

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
		_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_STATUS_2 =
			"osiInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_STATUS_3 =
			"(osiInspection.status IS NULL OR osiInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_CASEIDAPPLICATIONID_OSIAPPLICATIONID_2 =
			"osiInspection.osiApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspection
	 * @throws NoSuchOsiInspectionException if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection findBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long osiApplicationId)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, osiApplicationId);

		if (osiInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", osiApplicationId=");
			sb.append(osiApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiInspectionException(sb.toString());
		}

		return osiInspection;
	}

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long osiApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, osiApplicationId, true);
	}

	/**
	 * Returns the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi inspection, or <code>null</code> if a matching osi inspection could not be found
	 */
	@Override
	public OsiInspection fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long osiApplicationId,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, osiApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof OsiInspection) {
			OsiInspection osiInspection = (OsiInspection)result;

			if (!Objects.equals(status, osiInspection.getStatus()) ||
				(slotBookedByUser != osiInspection.getSlotBookedByUser()) ||
				(osiApplicationId != osiInspection.getOsiApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_OSIINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(osiApplicationId);

				List<OsiInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									status, slotBookedByUser, osiApplicationId
								};
							}

							_log.warn(
								"OsiInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiInspection osiInspection = list.get(0);

					result = osiInspection;

					cacheResult(osiInspection);
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
			return (OsiInspection)result;
		}
	}

	/**
	 * Removes the osi inspection where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the osi inspection that was removed
	 */
	@Override
	public OsiInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long osiApplicationId)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, osiApplicationId);

		return remove(osiInspection);
	}

	/**
	 * Returns the number of osi inspections where status = &#63; and slotBookedByUser = &#63; and osiApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching osi inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long osiApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, osiApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_OSIINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2);

			sb.append(
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_OSIAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(slotBookedByUser);

				queryPos.add(osiApplicationId);

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
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_2 =
			"osiInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(osiInspection.status IS NULL OR osiInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"osiInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_OSIAPPLICATIONID_2 =
			"osiInspection.osiApplicationId = ?";

	public OsiInspectionPersistenceImpl() {
		setModelClass(OsiInspection.class);

		setModelImplClass(OsiInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(OsiInspectionTable.INSTANCE);
	}

	/**
	 * Caches the osi inspection in the entity cache if it is enabled.
	 *
	 * @param osiInspection the osi inspection
	 */
	@Override
	public void cacheResult(OsiInspection osiInspection) {
		entityCache.putResult(
			OsiInspectionImpl.class, osiInspection.getPrimaryKey(),
			osiInspection);

		finderCache.putResult(
			_finderPathFetchBygetOsiInspectionBy_CI,
			new Object[] {osiInspection.getCaseId()}, osiInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				osiInspection.getStatus(), osiInspection.getSlotBookedByUser(),
				osiInspection.getOsiApplicationId()
			},
			osiInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi inspections in the entity cache if it is enabled.
	 *
	 * @param osiInspections the osi inspections
	 */
	@Override
	public void cacheResult(List<OsiInspection> osiInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiInspections.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiInspection osiInspection : osiInspections) {
			if (entityCache.getResult(
					OsiInspectionImpl.class, osiInspection.getPrimaryKey()) ==
						null) {

				cacheResult(osiInspection);
			}
		}
	}

	/**
	 * Clears the cache for all osi inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiInspectionImpl.class);

		finderCache.clearCache(OsiInspectionImpl.class);
	}

	/**
	 * Clears the cache for the osi inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiInspection osiInspection) {
		entityCache.removeResult(OsiInspectionImpl.class, osiInspection);
	}

	@Override
	public void clearCache(List<OsiInspection> osiInspections) {
		for (OsiInspection osiInspection : osiInspections) {
			entityCache.removeResult(OsiInspectionImpl.class, osiInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OsiInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiInspectionModelImpl osiInspectionModelImpl) {

		Object[] args = new Object[] {osiInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetOsiInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiInspectionBy_CI, args,
			osiInspectionModelImpl);

		args = new Object[] {
			osiInspectionModelImpl.getStatus(),
			osiInspectionModelImpl.getSlotBookedByUser(),
			osiInspectionModelImpl.getOsiApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, osiInspectionModelImpl);
	}

	/**
	 * Creates a new osi inspection with the primary key. Does not add the osi inspection to the database.
	 *
	 * @param osiInspectionId the primary key for the new osi inspection
	 * @return the new osi inspection
	 */
	@Override
	public OsiInspection create(long osiInspectionId) {
		OsiInspection osiInspection = new OsiInspectionImpl();

		osiInspection.setNew(true);
		osiInspection.setPrimaryKey(osiInspectionId);

		osiInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiInspection;
	}

	/**
	 * Removes the osi inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection that was removed
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection remove(long osiInspectionId)
		throws NoSuchOsiInspectionException {

		return remove((Serializable)osiInspectionId);
	}

	/**
	 * Removes the osi inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi inspection
	 * @return the osi inspection that was removed
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection remove(Serializable primaryKey)
		throws NoSuchOsiInspectionException {

		Session session = null;

		try {
			session = openSession();

			OsiInspection osiInspection = (OsiInspection)session.get(
				OsiInspectionImpl.class, primaryKey);

			if (osiInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiInspection);
		}
		catch (NoSuchOsiInspectionException noSuchEntityException) {
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
	protected OsiInspection removeImpl(OsiInspection osiInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiInspection)) {
				osiInspection = (OsiInspection)session.get(
					OsiInspectionImpl.class, osiInspection.getPrimaryKeyObj());
			}

			if (osiInspection != null) {
				session.delete(osiInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiInspection != null) {
			clearCache(osiInspection);
		}

		return osiInspection;
	}

	@Override
	public OsiInspection updateImpl(OsiInspection osiInspection) {
		boolean isNew = osiInspection.isNew();

		if (!(osiInspection instanceof OsiInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiInspection implementation " +
					osiInspection.getClass());
		}

		OsiInspectionModelImpl osiInspectionModelImpl =
			(OsiInspectionModelImpl)osiInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiInspection.setCreateDate(date);
			}
			else {
				osiInspection.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!osiInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiInspection.setModifiedDate(date);
			}
			else {
				osiInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiInspection);
			}
			else {
				osiInspection = (OsiInspection)session.merge(osiInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiInspectionImpl.class, osiInspectionModelImpl, false, true);

		cacheUniqueFindersCache(osiInspectionModelImpl);

		if (isNew) {
			osiInspection.setNew(false);
		}

		osiInspection.resetOriginalValues();

		return osiInspection;
	}

	/**
	 * Returns the osi inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi inspection
	 * @return the osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiInspectionException {

		OsiInspection osiInspection = fetchByPrimaryKey(primaryKey);

		if (osiInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiInspection;
	}

	/**
	 * Returns the osi inspection with the primary key or throws a <code>NoSuchOsiInspectionException</code> if it could not be found.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection
	 * @throws NoSuchOsiInspectionException if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection findByPrimaryKey(long osiInspectionId)
		throws NoSuchOsiInspectionException {

		return findByPrimaryKey((Serializable)osiInspectionId);
	}

	/**
	 * Returns the osi inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection, or <code>null</code> if a osi inspection with the primary key could not be found
	 */
	@Override
	public OsiInspection fetchByPrimaryKey(long osiInspectionId) {
		return fetchByPrimaryKey((Serializable)osiInspectionId);
	}

	/**
	 * Returns all the osi inspections.
	 *
	 * @return the osi inspections
	 */
	@Override
	public List<OsiInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of osi inspections
	 */
	@Override
	public List<OsiInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi inspections
	 */
	@Override
	public List<OsiInspection> findAll(
		int start, int end,
		OrderByComparator<OsiInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi inspections
	 */
	@Override
	public List<OsiInspection> findAll(
		int start, int end, OrderByComparator<OsiInspection> orderByComparator,
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

		List<OsiInspection> list = null;

		if (useFinderCache) {
			list = (List<OsiInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSIINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSIINSPECTION;

				sql = sql.concat(OsiInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiInspection>)QueryUtil.list(
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
	 * Removes all the osi inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiInspection osiInspection : findAll()) {
			remove(osiInspection);
		}
	}

	/**
	 * Returns the number of osi inspections.
	 *
	 * @return the number of osi inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OSIINSPECTION);

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
		return "osiInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSIINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi inspection persistence.
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

		_finderPathFetchBygetOsiInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOsiInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetOSI_OAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOSI_OAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetOSI_OAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOSI_OAI",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, true);

		_finderPathCountBygetOSI_OAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOSI_OAI",
			new String[] {Long.class.getName()},
			new String[] {"osiApplicationId"}, false);

		_finderPathWithPaginationFindBygetOSI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOSI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetOSI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOSI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOSI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOSI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetMI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetOSI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOSI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetOSI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetOSI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetOSI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetOSI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOSI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "osiApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetOSI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOSI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "osiApplicationId"}, true);

		_finderPathCountBygetOSI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "osiApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {"status", "slotBookedByUser", "osiApplicationId"},
				true);

		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {"status", "slotBookedByUser", "osiApplicationId"},
				false);

		OsiInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiInspectionUtil.setPersistence(null);

		entityCache.removeCache(OsiInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSIINSPECTION =
		"SELECT osiInspection FROM OsiInspection osiInspection";

	private static final String _SQL_SELECT_OSIINSPECTION_WHERE =
		"SELECT osiInspection FROM OsiInspection osiInspection WHERE ";

	private static final String _SQL_COUNT_OSIINSPECTION =
		"SELECT COUNT(osiInspection) FROM OsiInspection osiInspection";

	private static final String _SQL_COUNT_OSIINSPECTION_WHERE =
		"SELECT COUNT(osiInspection) FROM OsiInspection osiInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "osiInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}