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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.janaac.stages.services.exception.NoSuchJanaacPaymentVerificationException;
import com.nbp.janaac.stages.services.model.JanaacPaymentVerification;
import com.nbp.janaac.stages.services.model.JanaacPaymentVerificationTable;
import com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationImpl;
import com.nbp.janaac.stages.services.model.impl.JanaacPaymentVerificationModelImpl;
import com.nbp.janaac.stages.services.service.persistence.JanaacPaymentVerificationPersistence;
import com.nbp.janaac.stages.services.service.persistence.JanaacPaymentVerificationUtil;
import com.nbp.janaac.stages.services.service.persistence.impl.constants.JANAAC_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
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
 * The persistence implementation for the janaac payment verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JanaacPaymentVerificationPersistence.class)
public class JanaacPaymentVerificationPersistenceImpl
	extends BasePersistenceImpl<JanaacPaymentVerification>
	implements JanaacPaymentVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JanaacPaymentVerificationUtil</code> to access the janaac payment verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JanaacPaymentVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJanaacPaymentBy_CI;
	private FinderPath _finderPathCountBygetJanaacPaymentBy_CI;

	/**
	 * Returns the janaac payment verification where caseId = &#63; or throws a <code>NoSuchJanaacPaymentVerificationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	@Override
	public JanaacPaymentVerification findBygetJanaacPaymentBy_CI(String caseId)
		throws NoSuchJanaacPaymentVerificationException {

		JanaacPaymentVerification janaacPaymentVerification =
			fetchBygetJanaacPaymentBy_CI(caseId);

		if (janaacPaymentVerification == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacPaymentVerificationException(sb.toString());
		}

		return janaacPaymentVerification;
	}

	/**
	 * Returns the janaac payment verification where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	@Override
	public JanaacPaymentVerification fetchBygetJanaacPaymentBy_CI(
		String caseId) {

		return fetchBygetJanaacPaymentBy_CI(caseId, true);
	}

	/**
	 * Returns the janaac payment verification where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	@Override
	public JanaacPaymentVerification fetchBygetJanaacPaymentBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJanaacPaymentBy_CI, finderArgs, this);
		}

		if (result instanceof JanaacPaymentVerification) {
			JanaacPaymentVerification janaacPaymentVerification =
				(JanaacPaymentVerification)result;

			if (!Objects.equals(
					caseId, janaacPaymentVerification.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACPAYMENTVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAACPAYMENTBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAACPAYMENTBY_CI_CASEID_2);
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

				List<JanaacPaymentVerification> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJanaacPaymentBy_CI, finderArgs,
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
								"JanaacPaymentVerificationPersistenceImpl.fetchBygetJanaacPaymentBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacPaymentVerification janaacPaymentVerification =
						list.get(0);

					result = janaacPaymentVerification;

					cacheResult(janaacPaymentVerification);
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
			return (JanaacPaymentVerification)result;
		}
	}

	/**
	 * Removes the janaac payment verification where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac payment verification that was removed
	 */
	@Override
	public JanaacPaymentVerification removeBygetJanaacPaymentBy_CI(
			String caseId)
		throws NoSuchJanaacPaymentVerificationException {

		JanaacPaymentVerification janaacPaymentVerification =
			findBygetJanaacPaymentBy_CI(caseId);

		return remove(janaacPaymentVerification);
	}

	/**
	 * Returns the number of janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac payment verifications
	 */
	@Override
	public int countBygetJanaacPaymentBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJanaacPaymentBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACPAYMENTVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAACPAYMENTBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAACPAYMENTBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAACPAYMENTBY_CI_CASEID_2 =
		"janaacPaymentVerification.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAACPAYMENTBY_CI_CASEID_3 =
		"(janaacPaymentVerification.caseId IS NULL OR janaacPaymentVerification.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJanaacPayConfBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetJanaacPayConfBy_CI;
	private FinderPath _finderPathCountBygetJanaacPayConfBy_CI;

	/**
	 * Returns all the janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> findBygetJanaacPayConfBy_CI(
		String caseId) {

		return findBygetJanaacPayConfBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @return the range of matching janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> findBygetJanaacPayConfBy_CI(
		String caseId, int start, int end) {

		return findBygetJanaacPayConfBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> findBygetJanaacPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		return findBygetJanaacPayConfBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac payment verifications where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> findBygetJanaacPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJanaacPayConfBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJanaacPayConfBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<JanaacPaymentVerification> list = null;

		if (useFinderCache) {
			list = (List<JanaacPaymentVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacPaymentVerification janaacPaymentVerification :
						list) {

					if (!caseId.equals(janaacPaymentVerification.getCaseId())) {
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

			sb.append(_SQL_SELECT_JANAACPAYMENTVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAACPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAACPAYCONFBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacPaymentVerificationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacPaymentVerification>)QueryUtil.list(
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
	 * Returns the first janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	@Override
	public JanaacPaymentVerification findBygetJanaacPayConfBy_CI_First(
			String caseId,
			OrderByComparator<JanaacPaymentVerification> orderByComparator)
		throws NoSuchJanaacPaymentVerificationException {

		JanaacPaymentVerification janaacPaymentVerification =
			fetchBygetJanaacPayConfBy_CI_First(caseId, orderByComparator);

		if (janaacPaymentVerification != null) {
			return janaacPaymentVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJanaacPaymentVerificationException(sb.toString());
	}

	/**
	 * Returns the first janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	@Override
	public JanaacPaymentVerification fetchBygetJanaacPayConfBy_CI_First(
		String caseId,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		List<JanaacPaymentVerification> list = findBygetJanaacPayConfBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a matching janaac payment verification could not be found
	 */
	@Override
	public JanaacPaymentVerification findBygetJanaacPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<JanaacPaymentVerification> orderByComparator)
		throws NoSuchJanaacPaymentVerificationException {

		JanaacPaymentVerification janaacPaymentVerification =
			fetchBygetJanaacPayConfBy_CI_Last(caseId, orderByComparator);

		if (janaacPaymentVerification != null) {
			return janaacPaymentVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJanaacPaymentVerificationException(sb.toString());
	}

	/**
	 * Returns the last janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac payment verification, or <code>null</code> if a matching janaac payment verification could not be found
	 */
	@Override
	public JanaacPaymentVerification fetchBygetJanaacPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		int count = countBygetJanaacPayConfBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<JanaacPaymentVerification> list = findBygetJanaacPayConfBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac payment verifications before and after the current janaac payment verification in the ordered set where caseId = &#63;.
	 *
	 * @param janaacPaymentVerificationId the primary key of the current janaac payment verification
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public JanaacPaymentVerification[] findBygetJanaacPayConfBy_CI_PrevAndNext(
			long janaacPaymentVerificationId, String caseId,
			OrderByComparator<JanaacPaymentVerification> orderByComparator)
		throws NoSuchJanaacPaymentVerificationException {

		caseId = Objects.toString(caseId, "");

		JanaacPaymentVerification janaacPaymentVerification = findByPrimaryKey(
			janaacPaymentVerificationId);

		Session session = null;

		try {
			session = openSession();

			JanaacPaymentVerification[] array =
				new JanaacPaymentVerificationImpl[3];

			array[0] = getBygetJanaacPayConfBy_CI_PrevAndNext(
				session, janaacPaymentVerification, caseId, orderByComparator,
				true);

			array[1] = janaacPaymentVerification;

			array[2] = getBygetJanaacPayConfBy_CI_PrevAndNext(
				session, janaacPaymentVerification, caseId, orderByComparator,
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

	protected JanaacPaymentVerification getBygetJanaacPayConfBy_CI_PrevAndNext(
		Session session, JanaacPaymentVerification janaacPaymentVerification,
		String caseId,
		OrderByComparator<JanaacPaymentVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACPAYMENTVERIFICATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJANAACPAYCONFBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJANAACPAYCONFBY_CI_CASEID_2);
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
			sb.append(JanaacPaymentVerificationModelImpl.ORDER_BY_JPQL);
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
						janaacPaymentVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacPaymentVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac payment verifications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJanaacPayConfBy_CI(String caseId) {
		for (JanaacPaymentVerification janaacPaymentVerification :
				findBygetJanaacPayConfBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(janaacPaymentVerification);
		}
	}

	/**
	 * Returns the number of janaac payment verifications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac payment verifications
	 */
	@Override
	public int countBygetJanaacPayConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJanaacPayConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACPAYMENTVERIFICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAACPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAACPAYCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAACPAYCONFBY_CI_CASEID_2 =
		"janaacPaymentVerification.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAACPAYCONFBY_CI_CASEID_3 =
		"(janaacPaymentVerification.caseId IS NULL OR janaacPaymentVerification.caseId = '')";

	public JanaacPaymentVerificationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JanaacPaymentVerification.class);

		setModelImplClass(JanaacPaymentVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(JanaacPaymentVerificationTable.INSTANCE);
	}

	/**
	 * Caches the janaac payment verification in the entity cache if it is enabled.
	 *
	 * @param janaacPaymentVerification the janaac payment verification
	 */
	@Override
	public void cacheResult(
		JanaacPaymentVerification janaacPaymentVerification) {

		entityCache.putResult(
			JanaacPaymentVerificationImpl.class,
			janaacPaymentVerification.getPrimaryKey(),
			janaacPaymentVerification);

		finderCache.putResult(
			_finderPathFetchBygetJanaacPaymentBy_CI,
			new Object[] {janaacPaymentVerification.getCaseId()},
			janaacPaymentVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the janaac payment verifications in the entity cache if it is enabled.
	 *
	 * @param janaacPaymentVerifications the janaac payment verifications
	 */
	@Override
	public void cacheResult(
		List<JanaacPaymentVerification> janaacPaymentVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (janaacPaymentVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JanaacPaymentVerification janaacPaymentVerification :
				janaacPaymentVerifications) {

			if (entityCache.getResult(
					JanaacPaymentVerificationImpl.class,
					janaacPaymentVerification.getPrimaryKey()) == null) {

				cacheResult(janaacPaymentVerification);
			}
		}
	}

	/**
	 * Clears the cache for all janaac payment verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JanaacPaymentVerificationImpl.class);

		finderCache.clearCache(JanaacPaymentVerificationImpl.class);
	}

	/**
	 * Clears the cache for the janaac payment verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		JanaacPaymentVerification janaacPaymentVerification) {

		entityCache.removeResult(
			JanaacPaymentVerificationImpl.class, janaacPaymentVerification);
	}

	@Override
	public void clearCache(
		List<JanaacPaymentVerification> janaacPaymentVerifications) {

		for (JanaacPaymentVerification janaacPaymentVerification :
				janaacPaymentVerifications) {

			entityCache.removeResult(
				JanaacPaymentVerificationImpl.class, janaacPaymentVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JanaacPaymentVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JanaacPaymentVerificationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JanaacPaymentVerificationModelImpl janaacPaymentVerificationModelImpl) {

		Object[] args = new Object[] {
			janaacPaymentVerificationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJanaacPaymentBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJanaacPaymentBy_CI, args,
			janaacPaymentVerificationModelImpl);
	}

	/**
	 * Creates a new janaac payment verification with the primary key. Does not add the janaac payment verification to the database.
	 *
	 * @param janaacPaymentVerificationId the primary key for the new janaac payment verification
	 * @return the new janaac payment verification
	 */
	@Override
	public JanaacPaymentVerification create(long janaacPaymentVerificationId) {
		JanaacPaymentVerification janaacPaymentVerification =
			new JanaacPaymentVerificationImpl();

		janaacPaymentVerification.setNew(true);
		janaacPaymentVerification.setPrimaryKey(janaacPaymentVerificationId);

		janaacPaymentVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return janaacPaymentVerification;
	}

	/**
	 * Removes the janaac payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification that was removed
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public JanaacPaymentVerification remove(long janaacPaymentVerificationId)
		throws NoSuchJanaacPaymentVerificationException {

		return remove((Serializable)janaacPaymentVerificationId);
	}

	/**
	 * Removes the janaac payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the janaac payment verification
	 * @return the janaac payment verification that was removed
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public JanaacPaymentVerification remove(Serializable primaryKey)
		throws NoSuchJanaacPaymentVerificationException {

		Session session = null;

		try {
			session = openSession();

			JanaacPaymentVerification janaacPaymentVerification =
				(JanaacPaymentVerification)session.get(
					JanaacPaymentVerificationImpl.class, primaryKey);

			if (janaacPaymentVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJanaacPaymentVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(janaacPaymentVerification);
		}
		catch (NoSuchJanaacPaymentVerificationException noSuchEntityException) {
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
	protected JanaacPaymentVerification removeImpl(
		JanaacPaymentVerification janaacPaymentVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(janaacPaymentVerification)) {
				janaacPaymentVerification =
					(JanaacPaymentVerification)session.get(
						JanaacPaymentVerificationImpl.class,
						janaacPaymentVerification.getPrimaryKeyObj());
			}

			if (janaacPaymentVerification != null) {
				session.delete(janaacPaymentVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (janaacPaymentVerification != null) {
			clearCache(janaacPaymentVerification);
		}

		return janaacPaymentVerification;
	}

	@Override
	public JanaacPaymentVerification updateImpl(
		JanaacPaymentVerification janaacPaymentVerification) {

		boolean isNew = janaacPaymentVerification.isNew();

		if (!(janaacPaymentVerification instanceof
				JanaacPaymentVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(janaacPaymentVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					janaacPaymentVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in janaacPaymentVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JanaacPaymentVerification implementation " +
					janaacPaymentVerification.getClass());
		}

		JanaacPaymentVerificationModelImpl janaacPaymentVerificationModelImpl =
			(JanaacPaymentVerificationModelImpl)janaacPaymentVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (janaacPaymentVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				janaacPaymentVerification.setCreateDate(date);
			}
			else {
				janaacPaymentVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!janaacPaymentVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				janaacPaymentVerification.setModifiedDate(date);
			}
			else {
				janaacPaymentVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(janaacPaymentVerification);
			}
			else {
				janaacPaymentVerification =
					(JanaacPaymentVerification)session.merge(
						janaacPaymentVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JanaacPaymentVerificationImpl.class,
			janaacPaymentVerificationModelImpl, false, true);

		cacheUniqueFindersCache(janaacPaymentVerificationModelImpl);

		if (isNew) {
			janaacPaymentVerification.setNew(false);
		}

		janaacPaymentVerification.resetOriginalValues();

		return janaacPaymentVerification;
	}

	/**
	 * Returns the janaac payment verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the janaac payment verification
	 * @return the janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public JanaacPaymentVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJanaacPaymentVerificationException {

		JanaacPaymentVerification janaacPaymentVerification = fetchByPrimaryKey(
			primaryKey);

		if (janaacPaymentVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJanaacPaymentVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return janaacPaymentVerification;
	}

	/**
	 * Returns the janaac payment verification with the primary key or throws a <code>NoSuchJanaacPaymentVerificationException</code> if it could not be found.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification
	 * @throws NoSuchJanaacPaymentVerificationException if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public JanaacPaymentVerification findByPrimaryKey(
			long janaacPaymentVerificationId)
		throws NoSuchJanaacPaymentVerificationException {

		return findByPrimaryKey((Serializable)janaacPaymentVerificationId);
	}

	/**
	 * Returns the janaac payment verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacPaymentVerificationId the primary key of the janaac payment verification
	 * @return the janaac payment verification, or <code>null</code> if a janaac payment verification with the primary key could not be found
	 */
	@Override
	public JanaacPaymentVerification fetchByPrimaryKey(
		long janaacPaymentVerificationId) {

		return fetchByPrimaryKey((Serializable)janaacPaymentVerificationId);
	}

	/**
	 * Returns all the janaac payment verifications.
	 *
	 * @return the janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @return the range of janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> findAll(
		int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac payment verifications
	 * @param end the upper bound of the range of janaac payment verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac payment verifications
	 */
	@Override
	public List<JanaacPaymentVerification> findAll(
		int start, int end,
		OrderByComparator<JanaacPaymentVerification> orderByComparator,
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

		List<JanaacPaymentVerification> list = null;

		if (useFinderCache) {
			list = (List<JanaacPaymentVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JANAACPAYMENTVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JANAACPAYMENTVERIFICATION;

				sql = sql.concat(
					JanaacPaymentVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JanaacPaymentVerification>)QueryUtil.list(
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
	 * Removes all the janaac payment verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JanaacPaymentVerification janaacPaymentVerification : findAll()) {
			remove(janaacPaymentVerification);
		}
	}

	/**
	 * Returns the number of janaac payment verifications.
	 *
	 * @return the number of janaac payment verifications
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
					_SQL_COUNT_JANAACPAYMENTVERIFICATION);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "janaacPaymentVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JANAACPAYMENTVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JanaacPaymentVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the janaac payment verification persistence.
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

		_finderPathFetchBygetJanaacPaymentBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJanaacPaymentBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJanaacPaymentBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaacPaymentBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJanaacPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetJanaacPayConfBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetJanaacPayConfBy_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetJanaacPayConfBy_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetJanaacPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJanaacPayConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		JanaacPaymentVerificationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JanaacPaymentVerificationUtil.setPersistence(null);

		entityCache.removeCache(JanaacPaymentVerificationImpl.class.getName());
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

	private static final String _SQL_SELECT_JANAACPAYMENTVERIFICATION =
		"SELECT janaacPaymentVerification FROM JanaacPaymentVerification janaacPaymentVerification";

	private static final String _SQL_SELECT_JANAACPAYMENTVERIFICATION_WHERE =
		"SELECT janaacPaymentVerification FROM JanaacPaymentVerification janaacPaymentVerification WHERE ";

	private static final String _SQL_COUNT_JANAACPAYMENTVERIFICATION =
		"SELECT COUNT(janaacPaymentVerification) FROM JanaacPaymentVerification janaacPaymentVerification";

	private static final String _SQL_COUNT_JANAACPAYMENTVERIFICATION_WHERE =
		"SELECT COUNT(janaacPaymentVerification) FROM JanaacPaymentVerification janaacPaymentVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"janaacPaymentVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JanaacPaymentVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JanaacPaymentVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JanaacPaymentVerificationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}