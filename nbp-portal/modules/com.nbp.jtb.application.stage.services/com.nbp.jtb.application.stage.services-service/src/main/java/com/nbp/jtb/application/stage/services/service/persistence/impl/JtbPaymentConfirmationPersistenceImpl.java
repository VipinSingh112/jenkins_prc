/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence.impl;

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

import com.nbp.jtb.application.stage.services.exception.NoSuchJtbPaymentConfirmationException;
import com.nbp.jtb.application.stage.services.model.JtbPaymentConfirmation;
import com.nbp.jtb.application.stage.services.model.JtbPaymentConfirmationTable;
import com.nbp.jtb.application.stage.services.model.impl.JtbPaymentConfirmationImpl;
import com.nbp.jtb.application.stage.services.model.impl.JtbPaymentConfirmationModelImpl;
import com.nbp.jtb.application.stage.services.service.persistence.JtbPaymentConfirmationPersistence;
import com.nbp.jtb.application.stage.services.service.persistence.JtbPaymentConfirmationUtil;
import com.nbp.jtb.application.stage.services.service.persistence.impl.constants.JTB_APPLICATION_STAGEPersistenceConstants;

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
 * The persistence implementation for the jtb payment confirmation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JtbPaymentConfirmationPersistence.class)
public class JtbPaymentConfirmationPersistenceImpl
	extends BasePersistenceImpl<JtbPaymentConfirmation>
	implements JtbPaymentConfirmationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JtbPaymentConfirmationUtil</code> to access the jtb payment confirmation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JtbPaymentConfirmationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetJtbPaymentConfBy_CI;
	private FinderPath _finderPathCountBygetJtbPaymentConfBy_CI;

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or throws a <code>NoSuchJtbPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	@Override
	public JtbPaymentConfirmation findBygetJtbPaymentConfBy_CI(String caseId)
		throws NoSuchJtbPaymentConfirmationException {

		JtbPaymentConfirmation jtbPaymentConfirmation =
			fetchBygetJtbPaymentConfBy_CI(caseId);

		if (jtbPaymentConfirmation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJtbPaymentConfirmationException(sb.toString());
		}

		return jtbPaymentConfirmation;
	}

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	@Override
	public JtbPaymentConfirmation fetchBygetJtbPaymentConfBy_CI(String caseId) {
		return fetchBygetJtbPaymentConfBy_CI(caseId, true);
	}

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	@Override
	public JtbPaymentConfirmation fetchBygetJtbPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJtbPaymentConfBy_CI, finderArgs, this);
		}

		if (result instanceof JtbPaymentConfirmation) {
			JtbPaymentConfirmation jtbPaymentConfirmation =
				(JtbPaymentConfirmation)result;

			if (!Objects.equals(caseId, jtbPaymentConfirmation.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBPAYMENTCONFBY_CI_CASEID_2);
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

				List<JtbPaymentConfirmation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJtbPaymentConfBy_CI,
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
								"JtbPaymentConfirmationPersistenceImpl.fetchBygetJtbPaymentConfBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JtbPaymentConfirmation jtbPaymentConfirmation = list.get(0);

					result = jtbPaymentConfirmation;

					cacheResult(jtbPaymentConfirmation);
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
			return (JtbPaymentConfirmation)result;
		}
	}

	/**
	 * Removes the jtb payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb payment confirmation that was removed
	 */
	@Override
	public JtbPaymentConfirmation removeBygetJtbPaymentConfBy_CI(String caseId)
		throws NoSuchJtbPaymentConfirmationException {

		JtbPaymentConfirmation jtbPaymentConfirmation =
			findBygetJtbPaymentConfBy_CI(caseId);

		return remove(jtbPaymentConfirmation);
	}

	/**
	 * Returns the number of jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb payment confirmations
	 */
	@Override
	public int countBygetJtbPaymentConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtbPaymentConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBPAYMENTCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBPAYMENTCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTBPAYMENTCONFBY_CI_CASEID_2 =
		"jtbPaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTBPAYMENTCONFBY_CI_CASEID_3 =
		"(jtbPaymentConfirmation.caseId IS NULL OR jtbPaymentConfirmation.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJtbPayConfBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetJtbPayConfBy_CI;
	private FinderPath _finderPathCountBygetJtbPayConfBy_CI;

	/**
	 * Returns all the jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmations
	 */
	@Override
	public List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId) {

		return findBygetJtbPayConfBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @return the range of matching jtb payment confirmations
	 */
	@Override
	public List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end) {

		return findBygetJtbPayConfBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb payment confirmations
	 */
	@Override
	public List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		return findBygetJtbPayConfBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb payment confirmations
	 */
	@Override
	public List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJtbPayConfBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJtbPayConfBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<JtbPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<JtbPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JtbPaymentConfirmation jtbPaymentConfirmation : list) {
					if (!caseId.equals(jtbPaymentConfirmation.getCaseId())) {
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

			sb.append(_SQL_SELECT_JTBPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBPAYCONFBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JtbPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JtbPaymentConfirmation>)QueryUtil.list(
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
	 * Returns the first jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	@Override
	public JtbPaymentConfirmation findBygetJtbPayConfBy_CI_First(
			String caseId,
			OrderByComparator<JtbPaymentConfirmation> orderByComparator)
		throws NoSuchJtbPaymentConfirmationException {

		JtbPaymentConfirmation jtbPaymentConfirmation =
			fetchBygetJtbPayConfBy_CI_First(caseId, orderByComparator);

		if (jtbPaymentConfirmation != null) {
			return jtbPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJtbPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the first jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	@Override
	public JtbPaymentConfirmation fetchBygetJtbPayConfBy_CI_First(
		String caseId,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		List<JtbPaymentConfirmation> list = findBygetJtbPayConfBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	@Override
	public JtbPaymentConfirmation findBygetJtbPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<JtbPaymentConfirmation> orderByComparator)
		throws NoSuchJtbPaymentConfirmationException {

		JtbPaymentConfirmation jtbPaymentConfirmation =
			fetchBygetJtbPayConfBy_CI_Last(caseId, orderByComparator);

		if (jtbPaymentConfirmation != null) {
			return jtbPaymentConfirmation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchJtbPaymentConfirmationException(sb.toString());
	}

	/**
	 * Returns the last jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	@Override
	public JtbPaymentConfirmation fetchBygetJtbPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		int count = countBygetJtbPayConfBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<JtbPaymentConfirmation> list = findBygetJtbPayConfBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb payment confirmations before and after the current jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the current jtb payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	@Override
	public JtbPaymentConfirmation[] findBygetJtbPayConfBy_CI_PrevAndNext(
			long jtbPaymentConfirmationId, String caseId,
			OrderByComparator<JtbPaymentConfirmation> orderByComparator)
		throws NoSuchJtbPaymentConfirmationException {

		caseId = Objects.toString(caseId, "");

		JtbPaymentConfirmation jtbPaymentConfirmation = findByPrimaryKey(
			jtbPaymentConfirmationId);

		Session session = null;

		try {
			session = openSession();

			JtbPaymentConfirmation[] array = new JtbPaymentConfirmationImpl[3];

			array[0] = getBygetJtbPayConfBy_CI_PrevAndNext(
				session, jtbPaymentConfirmation, caseId, orderByComparator,
				true);

			array[1] = jtbPaymentConfirmation;

			array[2] = getBygetJtbPayConfBy_CI_PrevAndNext(
				session, jtbPaymentConfirmation, caseId, orderByComparator,
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

	protected JtbPaymentConfirmation getBygetJtbPayConfBy_CI_PrevAndNext(
		Session session, JtbPaymentConfirmation jtbPaymentConfirmation,
		String caseId,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBPAYMENTCONFIRMATION_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJTBPAYCONFBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETJTBPAYCONFBY_CI_CASEID_2);
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
			sb.append(JtbPaymentConfirmationModelImpl.ORDER_BY_JPQL);
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
						jtbPaymentConfirmation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JtbPaymentConfirmation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetJtbPayConfBy_CI(String caseId) {
		for (JtbPaymentConfirmation jtbPaymentConfirmation :
				findBygetJtbPayConfBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb payment confirmations
	 */
	@Override
	public int countBygetJtbPayConfBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJtbPayConfBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBPAYMENTCONFIRMATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTBPAYCONFBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTBPAYCONFBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTBPAYCONFBY_CI_CASEID_2 =
		"jtbPaymentConfirmation.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTBPAYCONFBY_CI_CASEID_3 =
		"(jtbPaymentConfirmation.caseId IS NULL OR jtbPaymentConfirmation.caseId = '')";

	public JtbPaymentConfirmationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("comment", "comment_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JtbPaymentConfirmation.class);

		setModelImplClass(JtbPaymentConfirmationImpl.class);
		setModelPKClass(long.class);

		setTable(JtbPaymentConfirmationTable.INSTANCE);
	}

	/**
	 * Caches the jtb payment confirmation in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentConfirmation the jtb payment confirmation
	 */
	@Override
	public void cacheResult(JtbPaymentConfirmation jtbPaymentConfirmation) {
		entityCache.putResult(
			JtbPaymentConfirmationImpl.class,
			jtbPaymentConfirmation.getPrimaryKey(), jtbPaymentConfirmation);

		finderCache.putResult(
			_finderPathFetchBygetJtbPaymentConfBy_CI,
			new Object[] {jtbPaymentConfirmation.getCaseId()},
			jtbPaymentConfirmation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb payment confirmations in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentConfirmations the jtb payment confirmations
	 */
	@Override
	public void cacheResult(
		List<JtbPaymentConfirmation> jtbPaymentConfirmations) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbPaymentConfirmations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JtbPaymentConfirmation jtbPaymentConfirmation :
				jtbPaymentConfirmations) {

			if (entityCache.getResult(
					JtbPaymentConfirmationImpl.class,
					jtbPaymentConfirmation.getPrimaryKey()) == null) {

				cacheResult(jtbPaymentConfirmation);
			}
		}
	}

	/**
	 * Clears the cache for all jtb payment confirmations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JtbPaymentConfirmationImpl.class);

		finderCache.clearCache(JtbPaymentConfirmationImpl.class);
	}

	/**
	 * Clears the cache for the jtb payment confirmation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JtbPaymentConfirmation jtbPaymentConfirmation) {
		entityCache.removeResult(
			JtbPaymentConfirmationImpl.class, jtbPaymentConfirmation);
	}

	@Override
	public void clearCache(
		List<JtbPaymentConfirmation> jtbPaymentConfirmations) {

		for (JtbPaymentConfirmation jtbPaymentConfirmation :
				jtbPaymentConfirmations) {

			entityCache.removeResult(
				JtbPaymentConfirmationImpl.class, jtbPaymentConfirmation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JtbPaymentConfirmationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				JtbPaymentConfirmationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JtbPaymentConfirmationModelImpl jtbPaymentConfirmationModelImpl) {

		Object[] args = new Object[] {
			jtbPaymentConfirmationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJtbPaymentConfBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJtbPaymentConfBy_CI, args,
			jtbPaymentConfirmationModelImpl);
	}

	/**
	 * Creates a new jtb payment confirmation with the primary key. Does not add the jtb payment confirmation to the database.
	 *
	 * @param jtbPaymentConfirmationId the primary key for the new jtb payment confirmation
	 * @return the new jtb payment confirmation
	 */
	@Override
	public JtbPaymentConfirmation create(long jtbPaymentConfirmationId) {
		JtbPaymentConfirmation jtbPaymentConfirmation =
			new JtbPaymentConfirmationImpl();

		jtbPaymentConfirmation.setNew(true);
		jtbPaymentConfirmation.setPrimaryKey(jtbPaymentConfirmationId);

		jtbPaymentConfirmation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbPaymentConfirmation;
	}

	/**
	 * Removes the jtb payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation that was removed
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	@Override
	public JtbPaymentConfirmation remove(long jtbPaymentConfirmationId)
		throws NoSuchJtbPaymentConfirmationException {

		return remove((Serializable)jtbPaymentConfirmationId);
	}

	/**
	 * Removes the jtb payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation that was removed
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	@Override
	public JtbPaymentConfirmation remove(Serializable primaryKey)
		throws NoSuchJtbPaymentConfirmationException {

		Session session = null;

		try {
			session = openSession();

			JtbPaymentConfirmation jtbPaymentConfirmation =
				(JtbPaymentConfirmation)session.get(
					JtbPaymentConfirmationImpl.class, primaryKey);

			if (jtbPaymentConfirmation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJtbPaymentConfirmationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbPaymentConfirmation);
		}
		catch (NoSuchJtbPaymentConfirmationException noSuchEntityException) {
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
	protected JtbPaymentConfirmation removeImpl(
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbPaymentConfirmation)) {
				jtbPaymentConfirmation = (JtbPaymentConfirmation)session.get(
					JtbPaymentConfirmationImpl.class,
					jtbPaymentConfirmation.getPrimaryKeyObj());
			}

			if (jtbPaymentConfirmation != null) {
				session.delete(jtbPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbPaymentConfirmation != null) {
			clearCache(jtbPaymentConfirmation);
		}

		return jtbPaymentConfirmation;
	}

	@Override
	public JtbPaymentConfirmation updateImpl(
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		boolean isNew = jtbPaymentConfirmation.isNew();

		if (!(jtbPaymentConfirmation instanceof
				JtbPaymentConfirmationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbPaymentConfirmation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbPaymentConfirmation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbPaymentConfirmation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JtbPaymentConfirmation implementation " +
					jtbPaymentConfirmation.getClass());
		}

		JtbPaymentConfirmationModelImpl jtbPaymentConfirmationModelImpl =
			(JtbPaymentConfirmationModelImpl)jtbPaymentConfirmation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbPaymentConfirmation.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbPaymentConfirmation.setCreateDate(date);
			}
			else {
				jtbPaymentConfirmation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbPaymentConfirmationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbPaymentConfirmation.setModifiedDate(date);
			}
			else {
				jtbPaymentConfirmation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbPaymentConfirmation);
			}
			else {
				jtbPaymentConfirmation = (JtbPaymentConfirmation)session.merge(
					jtbPaymentConfirmation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JtbPaymentConfirmationImpl.class, jtbPaymentConfirmationModelImpl,
			false, true);

		cacheUniqueFindersCache(jtbPaymentConfirmationModelImpl);

		if (isNew) {
			jtbPaymentConfirmation.setNew(false);
		}

		jtbPaymentConfirmation.resetOriginalValues();

		return jtbPaymentConfirmation;
	}

	/**
	 * Returns the jtb payment confirmation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	@Override
	public JtbPaymentConfirmation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJtbPaymentConfirmationException {

		JtbPaymentConfirmation jtbPaymentConfirmation = fetchByPrimaryKey(
			primaryKey);

		if (jtbPaymentConfirmation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJtbPaymentConfirmationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbPaymentConfirmation;
	}

	/**
	 * Returns the jtb payment confirmation with the primary key or throws a <code>NoSuchJtbPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	@Override
	public JtbPaymentConfirmation findByPrimaryKey(
			long jtbPaymentConfirmationId)
		throws NoSuchJtbPaymentConfirmationException {

		return findByPrimaryKey((Serializable)jtbPaymentConfirmationId);
	}

	/**
	 * Returns the jtb payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation, or <code>null</code> if a jtb payment confirmation with the primary key could not be found
	 */
	@Override
	public JtbPaymentConfirmation fetchByPrimaryKey(
		long jtbPaymentConfirmationId) {

		return fetchByPrimaryKey((Serializable)jtbPaymentConfirmationId);
	}

	/**
	 * Returns all the jtb payment confirmations.
	 *
	 * @return the jtb payment confirmations
	 */
	@Override
	public List<JtbPaymentConfirmation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @return the range of jtb payment confirmations
	 */
	@Override
	public List<JtbPaymentConfirmation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb payment confirmations
	 */
	@Override
	public List<JtbPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb payment confirmations
	 */
	@Override
	public List<JtbPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator,
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

		List<JtbPaymentConfirmation> list = null;

		if (useFinderCache) {
			list = (List<JtbPaymentConfirmation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBPAYMENTCONFIRMATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBPAYMENTCONFIRMATION;

				sql = sql.concat(JtbPaymentConfirmationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JtbPaymentConfirmation>)QueryUtil.list(
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
	 * Removes all the jtb payment confirmations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JtbPaymentConfirmation jtbPaymentConfirmation : findAll()) {
			remove(jtbPaymentConfirmation);
		}
	}

	/**
	 * Returns the number of jtb payment confirmations.
	 *
	 * @return the number of jtb payment confirmations
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
					_SQL_COUNT_JTBPAYMENTCONFIRMATION);

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
		return "jtbPaymentConfirmationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBPAYMENTCONFIRMATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JtbPaymentConfirmationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb payment confirmation persistence.
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

		_finderPathFetchBygetJtbPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJtbPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJtbPaymentConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtbPaymentConfBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJtbPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJtbPayConfBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetJtbPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJtbPayConfBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetJtbPayConfBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJtbPayConfBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		JtbPaymentConfirmationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JtbPaymentConfirmationUtil.setPersistence(null);

		entityCache.removeCache(JtbPaymentConfirmationImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBPAYMENTCONFIRMATION =
		"SELECT jtbPaymentConfirmation FROM JtbPaymentConfirmation jtbPaymentConfirmation";

	private static final String _SQL_SELECT_JTBPAYMENTCONFIRMATION_WHERE =
		"SELECT jtbPaymentConfirmation FROM JtbPaymentConfirmation jtbPaymentConfirmation WHERE ";

	private static final String _SQL_COUNT_JTBPAYMENTCONFIRMATION =
		"SELECT COUNT(jtbPaymentConfirmation) FROM JtbPaymentConfirmation jtbPaymentConfirmation";

	private static final String _SQL_COUNT_JTBPAYMENTCONFIRMATION_WHERE =
		"SELECT COUNT(jtbPaymentConfirmation) FROM JtbPaymentConfirmation jtbPaymentConfirmation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"jtbPaymentConfirmation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JtbPaymentConfirmation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JtbPaymentConfirmation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JtbPaymentConfirmationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"comment"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}