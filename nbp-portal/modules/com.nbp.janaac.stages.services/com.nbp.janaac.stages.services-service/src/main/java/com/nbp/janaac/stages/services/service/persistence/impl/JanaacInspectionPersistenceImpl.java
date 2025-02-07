/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service.persistence.impl;

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

import com.nbp.janaac.stages.services.exception.NoSuchJanaacInspectionException;
import com.nbp.janaac.stages.services.model.JanaacInspection;
import com.nbp.janaac.stages.services.model.JanaacInspectionTable;
import com.nbp.janaac.stages.services.model.impl.JanaacInspectionImpl;
import com.nbp.janaac.stages.services.model.impl.JanaacInspectionModelImpl;
import com.nbp.janaac.stages.services.service.persistence.JanaacInspectionPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacInspectionUtil;
import com.nbp.janaac.stages.services.service.persistence.impl.constants.JANAAC_STAGESPersistenceConstants;

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
 * The persistence implementation for the janaac inspection service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JanaacInspectionPersistence.class)
public class JanaacInspectionPersistenceImpl
	extends BasePersistenceImpl<JanaacInspection>
	implements JanaacInspectionPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JanaacInspectionUtil</code> to access the janaac inspection persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JanaacInspectionImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJanaacInspectionBy_CI;
	private FinderPath _finderPathCountBygetJanaacInspectionBy_CI;

	/**
	 * Returns the janaac inspection where caseId = &#63; or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaacInspectionBy_CI(String caseId)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetJanaacInspectionBy_CI(
			caseId);

		if (janaacInspection == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacInspectionException(sb.toString());
		}

		return janaacInspection;
	}

	/**
	 * Returns the janaac inspection where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaacInspectionBy_CI(String caseId) {
		return fetchBygetJanaacInspectionBy_CI(caseId, true);
	}

	/**
	 * Returns the janaac inspection where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaacInspectionBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJanaacInspectionBy_CI, finderArgs, this);
		}

		if (result instanceof JanaacInspection) {
			JanaacInspection janaacInspection = (JanaacInspection)result;

			if (!Objects.equals(caseId, janaacInspection.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAACINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAACINSPECTIONBY_CI_CASEID_2);
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

				List<JanaacInspection> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaacInspectionBy_CI,
							finderArgs, list);
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
								"JanaacInspectionPersistenceImpl.fetchBygetJanaacInspectionBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacInspection janaacInspection = list.get(0);

					result = janaacInspection;

					cacheResult(janaacInspection);
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
			return (JanaacInspection)result;
		}
	}

	/**
	 * Removes the janaac inspection where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac inspection that was removed
	 */
	@Override
	public JanaacInspection removeBygetJanaacInspectionBy_CI(String caseId)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = findBygetJanaacInspectionBy_CI(
			caseId);

		return remove(janaacInspection);
	}

	/**
	 * Returns the number of janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	@Override
	public int countBygetJanaacInspectionBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJanaacInspectionBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAACINSPECTIONBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAACINSPECTIONBY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETJANAACINSPECTIONBY_CI_CASEID_2 =
			"janaacInspection.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETJANAACINSPECTIONBY_CI_CASEID_3 =
			"(janaacInspection.caseId IS NULL OR janaacInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJanaac_AI;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaac_AI;
	private FinderPath _finderPathCountBygetJanaac_AI;

	/**
	 * Returns all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_AI(long janaacApplicationId) {
		return findBygetJanaac_AI(
			janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end) {

		return findBygetJanaac_AI(janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return findBygetJanaac_AI(
			janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_AI(
		long janaacApplicationId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaac_AI;
				finderArgs = new Object[] {janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaac_AI;
			finderArgs = new Object[] {
				janaacApplicationId, start, end, orderByComparator
			};
		}

		List<JanaacInspection> list = null;

		if (useFinderCache) {
			list = (List<JanaacInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacInspection janaacInspection : list) {
					if (janaacApplicationId !=
							janaacInspection.getJanaacApplicationId()) {

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

			sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_AI_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

				list = (List<JanaacInspection>)QueryUtil.list(
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
	 * Returns the first janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaac_AI_First(
			long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetJanaac_AI_First(
			janaacApplicationId, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the first janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaac_AI_First(
		long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		List<JanaacInspection> list = findBygetJanaac_AI(
			janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaac_AI_Last(
			long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetJanaac_AI_Last(
			janaacApplicationId, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the last janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaac_AI_Last(
		long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		int count = countBygetJanaac_AI(janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<JanaacInspection> list = findBygetJanaac_AI(
			janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where janaacApplicationId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection[] findBygetJanaac_AI_PrevAndNext(
			long janaacInspectionId, long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = findByPrimaryKey(
			janaacInspectionId);

		Session session = null;

		try {
			session = openSession();

			JanaacInspection[] array = new JanaacInspectionImpl[3];

			array[0] = getBygetJanaac_AI_PrevAndNext(
				session, janaacInspection, janaacApplicationId,
				orderByComparator, true);

			array[1] = janaacInspection;

			array[2] = getBygetJanaac_AI_PrevAndNext(
				session, janaacInspection, janaacApplicationId,
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

	protected JanaacInspection getBygetJanaac_AI_PrevAndNext(
		Session session, JanaacInspection janaacInspection,
		long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAAC_AI_JANAACAPPLICATIONID_2);

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
			sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						janaacInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac inspections where janaacApplicationId = &#63; from the database.
	 *
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaac_AI(long janaacApplicationId) {
		for (JanaacInspection janaacInspection :
				findBygetJanaac_AI(
					janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(janaacInspection);
		}
	}

	/**
	 * Returns the number of janaac inspections where janaacApplicationId = &#63;.
	 *
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	@Override
	public int countBygetJanaac_AI(long janaacApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJanaac_AI;

		Object[] finderArgs = new Object[] {janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACINSPECTION_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_AI_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAAC_AI_JANAACAPPLICATIONID_2 =
			"janaacInspection.janaacApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetjanaac_by_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetjanaac_by_CaseId;
	private FinderPath _finderPathCountBygetjanaac_by_CaseId;

	/**
	 * Returns all the janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetjanaac_by_CaseId(String caseId) {
		return findBygetjanaac_by_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end) {

		return findBygetjanaac_by_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return findBygetjanaac_by_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetjanaac_by_CaseId(
		String caseId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetjanaac_by_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetjanaac_by_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<JanaacInspection> list = null;

		if (useFinderCache) {
			list = (List<JanaacInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacInspection janaacInspection : list) {
					if (!caseId.equals(janaacInspection.getCaseId())) {
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

			sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacInspection>)QueryUtil.list(
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
	 * Returns the first janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetjanaac_by_CaseId_First(
			String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetjanaac_by_CaseId_First(
			caseId, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the first janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetjanaac_by_CaseId_First(
		String caseId, OrderByComparator<JanaacInspection> orderByComparator) {

		List<JanaacInspection> list = findBygetjanaac_by_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetjanaac_by_CaseId_Last(
			String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetjanaac_by_CaseId_Last(
			caseId, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the last janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetjanaac_by_CaseId_Last(
		String caseId, OrderByComparator<JanaacInspection> orderByComparator) {

		int count = countBygetjanaac_by_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<JanaacInspection> list = findBygetjanaac_by_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where caseId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection[] findBygetjanaac_by_CaseId_PrevAndNext(
			long janaacInspectionId, String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		caseId = Objects.toString(caseId, "");

		JanaacInspection janaacInspection = findByPrimaryKey(
			janaacInspectionId);

		Session session = null;

		try {
			session = openSession();

			JanaacInspection[] array = new JanaacInspectionImpl[3];

			array[0] = getBygetjanaac_by_CaseId_PrevAndNext(
				session, janaacInspection, caseId, orderByComparator, true);

			array[1] = janaacInspection;

			array[2] = getBygetjanaac_by_CaseId_PrevAndNext(
				session, janaacInspection, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JanaacInspection getBygetjanaac_by_CaseId_PrevAndNext(
		Session session, JanaacInspection janaacInspection, String caseId,
		OrderByComparator<JanaacInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
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
			sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
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
						janaacInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac inspections where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetjanaac_by_CaseId(String caseId) {
		for (JanaacInspection janaacInspection :
				findBygetjanaac_by_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(janaacInspection);
		}
	}

	/**
	 * Returns the number of janaac inspections where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	@Override
	public int countBygetjanaac_by_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetjanaac_by_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACINSPECTION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_2 =
		"janaacInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAAC_BY_CASEID_CASEID_3 =
		"(janaacInspection.caseId IS NULL OR janaacInspection.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJanaac_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaac_Status;
	private FinderPath _finderPathCountBygetJanaac_Status;

	/**
	 * Returns all the janaac inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_Status(String status) {
		return findBygetJanaac_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end) {

		return findBygetJanaac_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return findBygetJanaac_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_Status(
		String status, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJanaac_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaac_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<JanaacInspection> list = null;

		if (useFinderCache) {
			list = (List<JanaacInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacInspection janaacInspection : list) {
					if (!status.equals(janaacInspection.getStatus())) {
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

			sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacInspection>)QueryUtil.list(
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
	 * Returns the first janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaac_Status_First(
			String status,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetJanaac_Status_First(
			status, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaac_Status_First(
		String status, OrderByComparator<JanaacInspection> orderByComparator) {

		List<JanaacInspection> list = findBygetJanaac_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaac_Status_Last(
			String status,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetJanaac_Status_Last(
			status, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaac_Status_Last(
		String status, OrderByComparator<JanaacInspection> orderByComparator) {

		int count = countBygetJanaac_Status(status);

		if (count == 0) {
			return null;
		}

		List<JanaacInspection> list = findBygetJanaac_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection[] findBygetJanaac_Status_PrevAndNext(
			long janaacInspectionId, String status,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		status = Objects.toString(status, "");

		JanaacInspection janaacInspection = findByPrimaryKey(
			janaacInspectionId);

		Session session = null;

		try {
			session = openSession();

			JanaacInspection[] array = new JanaacInspectionImpl[3];

			array[0] = getBygetJanaac_Status_PrevAndNext(
				session, janaacInspection, status, orderByComparator, true);

			array[1] = janaacInspection;

			array[2] = getBygetJanaac_Status_PrevAndNext(
				session, janaacInspection, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JanaacInspection getBygetJanaac_Status_PrevAndNext(
		Session session, JanaacInspection janaacInspection, String status,
		OrderByComparator<JanaacInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJANAAC_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETJANAAC_STATUS_STATUS_2);
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
			sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
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
						janaacInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac inspections where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetJanaac_Status(String status) {
		for (JanaacInspection janaacInspection :
				findBygetJanaac_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(janaacInspection);
		}
	}

	/**
	 * Returns the number of janaac inspections where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching janaac inspections
	 */
	@Override
	public int countBygetJanaac_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_STATUS_STATUS_2);
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

	private static final String _FINDER_COLUMN_GETJANAAC_STATUS_STATUS_2 =
		"janaacInspection.status = ?";

	private static final String _FINDER_COLUMN_GETJANAAC_STATUS_STATUS_3 =
		"(janaacInspection.status IS NULL OR janaacInspection.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetJanaac_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaac_CaseIdStatus;
	private FinderPath _finderPathCountBygetJanaac_CaseIdStatus;

	/**
	 * Returns all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId) {

		return findBygetJanaac_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end) {

		return findBygetJanaac_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return findBygetJanaac_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_CaseIdStatus(
		String status, String caseId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJanaac_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaac_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<JanaacInspection> list = null;

		if (useFinderCache) {
			list = (List<JanaacInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacInspection janaacInspection : list) {
					if (!status.equals(janaacInspection.getStatus()) ||
						!caseId.equals(janaacInspection.getCaseId())) {

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

			sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacInspection>)QueryUtil.list(
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
	 * Returns the first janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaac_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetJanaac_CaseIdStatus_First(
			status, caseId, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaac_CaseIdStatus_First(
		String status, String caseId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		List<JanaacInspection> list = findBygetJanaac_CaseIdStatus(
			status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaac_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchBygetJanaac_CaseIdStatus_Last(
			status, caseId, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaac_CaseIdStatus_Last(
		String status, String caseId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		int count = countBygetJanaac_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<JanaacInspection> list = findBygetJanaac_CaseIdStatus(
			status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection[] findBygetJanaac_CaseIdStatus_PrevAndNext(
			long janaacInspectionId, String status, String caseId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		JanaacInspection janaacInspection = findByPrimaryKey(
			janaacInspectionId);

		Session session = null;

		try {
			session = openSession();

			JanaacInspection[] array = new JanaacInspectionImpl[3];

			array[0] = getBygetJanaac_CaseIdStatus_PrevAndNext(
				session, janaacInspection, status, caseId, orderByComparator,
				true);

			array[1] = janaacInspection;

			array[2] = getBygetJanaac_CaseIdStatus_PrevAndNext(
				session, janaacInspection, status, caseId, orderByComparator,
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

	protected JanaacInspection getBygetJanaac_CaseIdStatus_PrevAndNext(
		Session session, JanaacInspection janaacInspection, String status,
		String caseId, OrderByComparator<JanaacInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_CASEID_2);
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
			sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
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
						janaacInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac inspections where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJanaac_CaseIdStatus(String status, String caseId) {
		for (JanaacInspection janaacInspection :
				findBygetJanaac_CaseIdStatus(
					status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(janaacInspection);
		}
	}

	/**
	 * Returns the number of janaac inspections where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching janaac inspections
	 */
	@Override
	public int countBygetJanaac_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_STATUS_2 =
		"janaacInspection.status = ? AND ";

	private static final String _FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_STATUS_3 =
		"(janaacInspection.status IS NULL OR janaacInspection.status = '') AND ";

	private static final String _FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_CASEID_2 =
		"janaacInspection.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAAC_CASEIDSTATUS_CASEID_3 =
		"(janaacInspection.caseId IS NULL OR janaacInspection.caseId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetJanaac_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetJanaac_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetJanaac_CaseIdApplicationId;

	/**
	 * Returns all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId) {

		return findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end) {

		return findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac inspections
	 */
	@Override
	public List<JanaacInspection> findBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId, int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJanaac_CaseIdApplicationId;
				finderArgs = new Object[] {status, janaacApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetJanaac_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, janaacApplicationId, start, end, orderByComparator
			};
		}

		List<JanaacInspection> list = null;

		if (useFinderCache) {
			list = (List<JanaacInspection>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacInspection janaacInspection : list) {
					if (!status.equals(janaacInspection.getStatus()) ||
						(janaacApplicationId !=
							janaacInspection.getJanaacApplicationId())) {

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

			sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_JANAACAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
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

				queryPos.add(janaacApplicationId);

				list = (List<JanaacInspection>)QueryUtil.list(
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
	 * Returns the first janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaac_CaseIdApplicationId_First(
			String status, long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection =
			fetchBygetJanaac_CaseIdApplicationId_First(
				status, janaacApplicationId, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the first janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaac_CaseIdApplicationId_First(
		String status, long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		List<JanaacInspection> list = findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection findBygetJanaac_CaseIdApplicationId_Last(
			String status, long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection =
			fetchBygetJanaac_CaseIdApplicationId_Last(
				status, janaacApplicationId, orderByComparator);

		if (janaacInspection != null) {
			return janaacInspection;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", janaacApplicationId=");
		sb.append(janaacApplicationId);

		sb.append("}");

		throw new NoSuchJanaacInspectionException(sb.toString());
	}

	/**
	 * Returns the last janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection fetchBygetJanaac_CaseIdApplicationId_Last(
		String status, long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator) {

		int count = countBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId);

		if (count == 0) {
			return null;
		}

		List<JanaacInspection> list = findBygetJanaac_CaseIdApplicationId(
			status, janaacApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac inspections before and after the current janaac inspection in the ordered set where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param janaacInspectionId the primary key of the current janaac inspection
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection[] findBygetJanaac_CaseIdApplicationId_PrevAndNext(
			long janaacInspectionId, String status, long janaacApplicationId,
			OrderByComparator<JanaacInspection> orderByComparator)
		throws NoSuchJanaacInspectionException {

		status = Objects.toString(status, "");

		JanaacInspection janaacInspection = findByPrimaryKey(
			janaacInspectionId);

		Session session = null;

		try {
			session = openSession();

			JanaacInspection[] array = new JanaacInspectionImpl[3];

			array[0] = getBygetJanaac_CaseIdApplicationId_PrevAndNext(
				session, janaacInspection, status, janaacApplicationId,
				orderByComparator, true);

			array[1] = janaacInspection;

			array[2] = getBygetJanaac_CaseIdApplicationId_PrevAndNext(
				session, janaacInspection, status, janaacApplicationId,
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

	protected JanaacInspection getBygetJanaac_CaseIdApplicationId_PrevAndNext(
		Session session, JanaacInspection janaacInspection, String status,
		long janaacApplicationId,
		OrderByComparator<JanaacInspection> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_JANAACAPPLICATIONID_2);

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
			sb.append(JanaacInspectionModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(janaacApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						janaacInspection)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacInspection> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac inspections where status = &#63; and janaacApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 */
	@Override
	public void removeBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId) {

		for (JanaacInspection janaacInspection :
				findBygetJanaac_CaseIdApplicationId(
					status, janaacApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(janaacInspection);
		}
	}

	/**
	 * Returns the number of janaac inspections where status = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	@Override
	public int countBygetJanaac_CaseIdApplicationId(
		String status, long janaacApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetJanaac_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, janaacApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACINSPECTION_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_JANAACAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(janaacApplicationId);

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
		_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_STATUS_2 =
			"janaacInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_STATUS_3 =
			"(janaacInspection.status IS NULL OR janaacInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJANAAC_CASEIDAPPLICATIONID_JANAACAPPLICATIONID_2 =
			"janaacInspection.janaacApplicationId = ?";

	private FinderPath
		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId;
	private FinderPath
		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspection
	 * @throws NoSuchJanaacInspectionException if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long janaacApplicationId)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection =
			fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, janaacApplicationId);

		if (janaacInspection == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("status=");
			sb.append(status);

			sb.append(", slotBookedByUser=");
			sb.append(slotBookedByUser);

			sb.append(", janaacApplicationId=");
			sb.append(janaacApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacInspectionException(sb.toString());
		}

		return janaacInspection;
	}

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long janaacApplicationId) {

		return fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, janaacApplicationId, true);
	}

	/**
	 * Returns the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac inspection, or <code>null</code> if a matching janaac inspection could not be found
	 */
	@Override
	public JanaacInspection
		fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(
			String status, long slotBookedByUser, long janaacApplicationId,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				status, slotBookedByUser, janaacApplicationId
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
				finderArgs, this);
		}

		if (result instanceof JanaacInspection) {
			JanaacInspection janaacInspection = (JanaacInspection)result;

			if (!Objects.equals(status, janaacInspection.getStatus()) ||
				(slotBookedByUser != janaacInspection.getSlotBookedByUser()) ||
				(janaacApplicationId !=
					janaacInspection.getJanaacApplicationId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_JANAACINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_JANAACAPPLICATIONID_2);

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

				queryPos.add(janaacApplicationId);

				List<JanaacInspection> list = query.list();

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
									status, slotBookedByUser,
									janaacApplicationId
								};
							}

							_log.warn(
								"JanaacInspectionPersistenceImpl.fetchBygetInspectionByStatus_SlotBoooked_ApplicationId(String, long, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacInspection janaacInspection = list.get(0);

					result = janaacInspection;

					cacheResult(janaacInspection);
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
			return (JanaacInspection)result;
		}
	}

	/**
	 * Removes the janaac inspection where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the janaac inspection that was removed
	 */
	@Override
	public JanaacInspection
			removeBygetInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long janaacApplicationId)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection =
			findBygetInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, janaacApplicationId);

		return remove(janaacInspection);
	}

	/**
	 * Returns the number of janaac inspections where status = &#63; and slotBookedByUser = &#63; and janaacApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param slotBookedByUser the slot booked by user
	 * @param janaacApplicationId the janaac application ID
	 * @return the number of matching janaac inspections
	 */
	@Override
	public int countBygetInspectionByStatus_SlotBoooked_ApplicationId(
		String status, long slotBookedByUser, long janaacApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath =
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId;

		Object[] finderArgs = new Object[] {
			status, slotBookedByUser, janaacApplicationId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_JANAACINSPECTION_WHERE);

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
				_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_JANAACAPPLICATIONID_2);

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

				queryPos.add(janaacApplicationId);

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
			"janaacInspection.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_STATUS_3 =
			"(janaacInspection.status IS NULL OR janaacInspection.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_SLOTBOOKEDBYUSER_2 =
			"janaacInspection.slotBookedByUser = ? AND ";

	private static final String
		_FINDER_COLUMN_GETINSPECTIONBYSTATUS_SLOTBOOOKED_APPLICATIONID_JANAACAPPLICATIONID_2 =
			"janaacInspection.janaacApplicationId = ?";

	public JanaacInspectionPersistenceImpl() {
		setModelClass(JanaacInspection.class);

		setModelImplClass(JanaacInspectionImpl.class);
		setModelPKClass(long.class);

		setTable(JanaacInspectionTable.INSTANCE);
	}

	/**
	 * Caches the janaac inspection in the entity cache if it is enabled.
	 *
	 * @param janaacInspection the janaac inspection
	 */
	@Override
	public void cacheResult(JanaacInspection janaacInspection) {
		entityCache.putResult(
			JanaacInspectionImpl.class, janaacInspection.getPrimaryKey(),
			janaacInspection);

		finderCache.putResult(
			_finderPathFetchBygetJanaacInspectionBy_CI,
			new Object[] {janaacInspection.getCaseId()}, janaacInspection);

		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			new Object[] {
				janaacInspection.getStatus(),
				janaacInspection.getSlotBookedByUser(),
				janaacInspection.getJanaacApplicationId()
			},
			janaacInspection);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the janaac inspections in the entity cache if it is enabled.
	 *
	 * @param janaacInspections the janaac inspections
	 */
	@Override
	public void cacheResult(List<JanaacInspection> janaacInspections) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (janaacInspections.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JanaacInspection janaacInspection : janaacInspections) {
			if (entityCache.getResult(
					JanaacInspectionImpl.class,
					janaacInspection.getPrimaryKey()) == null) {

				cacheResult(janaacInspection);
			}
		}
	}

	/**
	 * Clears the cache for all janaac inspections.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JanaacInspectionImpl.class);

		finderCache.clearCache(JanaacInspectionImpl.class);
	}

	/**
	 * Clears the cache for the janaac inspection.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JanaacInspection janaacInspection) {
		entityCache.removeResult(JanaacInspectionImpl.class, janaacInspection);
	}

	@Override
	public void clearCache(List<JanaacInspection> janaacInspections) {
		for (JanaacInspection janaacInspection : janaacInspections) {
			entityCache.removeResult(
				JanaacInspectionImpl.class, janaacInspection);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JanaacInspectionImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JanaacInspectionImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JanaacInspectionModelImpl janaacInspectionModelImpl) {

		Object[] args = new Object[] {janaacInspectionModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJanaacInspectionBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaacInspectionBy_CI, args,
			janaacInspectionModelImpl);

		args = new Object[] {
			janaacInspectionModelImpl.getStatus(),
			janaacInspectionModelImpl.getSlotBookedByUser(),
			janaacInspectionModelImpl.getJanaacApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId,
			args, janaacInspectionModelImpl);
	}

	/**
	 * Creates a new janaac inspection with the primary key. Does not add the janaac inspection to the database.
	 *
	 * @param janaacInspectionId the primary key for the new janaac inspection
	 * @return the new janaac inspection
	 */
	@Override
	public JanaacInspection create(long janaacInspectionId) {
		JanaacInspection janaacInspection = new JanaacInspectionImpl();

		janaacInspection.setNew(true);
		janaacInspection.setPrimaryKey(janaacInspectionId);

		janaacInspection.setCompanyId(CompanyThreadLocal.getCompanyId());

		return janaacInspection;
	}

	/**
	 * Removes the janaac inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection that was removed
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection remove(long janaacInspectionId)
		throws NoSuchJanaacInspectionException {

		return remove((Serializable)janaacInspectionId);
	}

	/**
	 * Removes the janaac inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the janaac inspection
	 * @return the janaac inspection that was removed
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection remove(Serializable primaryKey)
		throws NoSuchJanaacInspectionException {

		Session session = null;

		try {
			session = openSession();

			JanaacInspection janaacInspection = (JanaacInspection)session.get(
				JanaacInspectionImpl.class, primaryKey);

			if (janaacInspection == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJanaacInspectionException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(janaacInspection);
		}
		catch (NoSuchJanaacInspectionException noSuchEntityException) {
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
	protected JanaacInspection removeImpl(JanaacInspection janaacInspection) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(janaacInspection)) {
				janaacInspection = (JanaacInspection)session.get(
					JanaacInspectionImpl.class,
					janaacInspection.getPrimaryKeyObj());
			}

			if (janaacInspection != null) {
				session.delete(janaacInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (janaacInspection != null) {
			clearCache(janaacInspection);
		}

		return janaacInspection;
	}

	@Override
	public JanaacInspection updateImpl(JanaacInspection janaacInspection) {
		boolean isNew = janaacInspection.isNew();

		if (!(janaacInspection instanceof JanaacInspectionModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(janaacInspection.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					janaacInspection);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in janaacInspection proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JanaacInspection implementation " +
					janaacInspection.getClass());
		}

		JanaacInspectionModelImpl janaacInspectionModelImpl =
			(JanaacInspectionModelImpl)janaacInspection;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (janaacInspection.getCreateDate() == null)) {
			if (serviceContext == null) {
				janaacInspection.setCreateDate(date);
			}
			else {
				janaacInspection.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!janaacInspectionModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				janaacInspection.setModifiedDate(date);
			}
			else {
				janaacInspection.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(janaacInspection);
			}
			else {
				janaacInspection = (JanaacInspection)session.merge(
					janaacInspection);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JanaacInspectionImpl.class, janaacInspectionModelImpl, false, true);

		cacheUniqueFindersCache(janaacInspectionModelImpl);

		if (isNew) {
			janaacInspection.setNew(false);
		}

		janaacInspection.resetOriginalValues();

		return janaacInspection;
	}

	/**
	 * Returns the janaac inspection with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the janaac inspection
	 * @return the janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJanaacInspectionException {

		JanaacInspection janaacInspection = fetchByPrimaryKey(primaryKey);

		if (janaacInspection == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJanaacInspectionException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return janaacInspection;
	}

	/**
	 * Returns the janaac inspection with the primary key or throws a <code>NoSuchJanaacInspectionException</code> if it could not be found.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection
	 * @throws NoSuchJanaacInspectionException if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection findByPrimaryKey(long janaacInspectionId)
		throws NoSuchJanaacInspectionException {

		return findByPrimaryKey((Serializable)janaacInspectionId);
	}

	/**
	 * Returns the janaac inspection with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection, or <code>null</code> if a janaac inspection with the primary key could not be found
	 */
	@Override
	public JanaacInspection fetchByPrimaryKey(long janaacInspectionId) {
		return fetchByPrimaryKey((Serializable)janaacInspectionId);
	}

	/**
	 * Returns all the janaac inspections.
	 *
	 * @return the janaac inspections
	 */
	@Override
	public List<JanaacInspection> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of janaac inspections
	 */
	@Override
	public List<JanaacInspection> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac inspections
	 */
	@Override
	public List<JanaacInspection> findAll(
		int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac inspections
	 */
	@Override
	public List<JanaacInspection> findAll(
		int start, int end,
		OrderByComparator<JanaacInspection> orderByComparator,
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

		List<JanaacInspection> list = null;

		if (useFinderCache) {
			list = (List<JanaacInspection>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JANAACINSPECTION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JANAACINSPECTION;

				sql = sql.concat(JanaacInspectionModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JanaacInspection>)QueryUtil.list(
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
	 * Removes all the janaac inspections from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JanaacInspection janaacInspection : findAll()) {
			remove(janaacInspection);
		}
	}

	/**
	 * Returns the number of janaac inspections.
	 *
	 * @return the number of janaac inspections
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JANAACINSPECTION);

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
		return "janaacInspectionId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JANAACINSPECTION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JanaacInspectionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the janaac inspection persistence.
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

		_finderPathFetchBygetJanaacInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaacInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJanaacInspectionBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaacInspectionBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJanaac_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaac_AI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaac_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaac_AI",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, true);

		_finderPathCountBygetJanaac_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJanaac_AI",
			new String[] {Long.class.getName()},
			new String[] {"janaacApplicationId"}, false);

		_finderPathWithPaginationFindBygetjanaac_by_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetjanaac_by_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetjanaac_by_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetjanaac_by_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetjanaac_by_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetjanaac_by_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetJanaac_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJanaac_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetJanaac_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJanaac_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetJanaac_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_Status", new String[] {String.class.getName()},
			new String[] {"status"}, false);

		_finderPathWithPaginationFindBygetJanaac_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetJanaac_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetJanaac_CaseIdStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetJanaac_CaseIdStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"status", "caseId"}, true);

		_finderPathCountBygetJanaac_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetJanaac_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetJanaac_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "janaacApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetJanaac_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetJanaac_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "janaacApplicationId"}, true);

		_finderPathCountBygetJanaac_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaac_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "janaacApplicationId"}, false);

		_finderPathFetchBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "janaacApplicationId"
				},
				true);

		_finderPathCountBygetInspectionByStatus_SlotBoooked_ApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetInspectionByStatus_SlotBoooked_ApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Long.class.getName()
				},
				new String[] {
					"status", "slotBookedByUser", "janaacApplicationId"
				},
				false);

		JanaacInspectionUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JanaacInspectionUtil.setPersistence(null);

		entityCache.removeCache(JanaacInspectionImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JANAACINSPECTION =
		"SELECT janaacInspection FROM JanaacInspection janaacInspection";

	private static final String _SQL_SELECT_JANAACINSPECTION_WHERE =
		"SELECT janaacInspection FROM JanaacInspection janaacInspection WHERE ";

	private static final String _SQL_COUNT_JANAACINSPECTION =
		"SELECT COUNT(janaacInspection) FROM JanaacInspection janaacInspection";

	private static final String _SQL_COUNT_JANAACINSPECTION_WHERE =
		"SELECT COUNT(janaacInspection) FROM JanaacInspection janaacInspection WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "janaacInspection.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JanaacInspection exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JanaacInspection exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JanaacInspectionPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}