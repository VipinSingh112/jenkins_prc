/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence.impl;

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

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjLicenceCertificateException;
import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;
import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificateTable;
import com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateImpl;
import com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl;
import com.nbp.ncbj.stages.services.service.persistence.NcbjLicenceCertificatePersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjLicenceCertificateUtil;
import com.nbp.ncbj.stages.services.service.persistence.impl.constants.NCBJ_STAGESPersistenceConstants;

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
 * The persistence implementation for the ncbj licence certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjLicenceCertificatePersistence.class)
public class NcbjLicenceCertificatePersistenceImpl
	extends BasePersistenceImpl<NcbjLicenceCertificate>
	implements NcbjLicenceCertificatePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjLicenceCertificateUtil</code> to access the ncbj licence certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjLicenceCertificateImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcbjLicenceCertiBy_CI;
	private FinderPath _finderPathCountBygetNcbjLicenceCertiBy_CI;

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or throws a <code>NoSuchNcbjLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	@Override
	public NcbjLicenceCertificate findBygetNcbjLicenceCertiBy_CI(String caseId)
		throws NoSuchNcbjLicenceCertificateException {

		NcbjLicenceCertificate ncbjLicenceCertificate =
			fetchBygetNcbjLicenceCertiBy_CI(caseId);

		if (ncbjLicenceCertificate == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjLicenceCertificateException(sb.toString());
		}

		return ncbjLicenceCertificate;
	}

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	@Override
	public NcbjLicenceCertificate fetchBygetNcbjLicenceCertiBy_CI(
		String caseId) {

		return fetchBygetNcbjLicenceCertiBy_CI(caseId, true);
	}

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	@Override
	public NcbjLicenceCertificate fetchBygetNcbjLicenceCertiBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbjLicenceCertiBy_CI, finderArgs, this);
		}

		if (result instanceof NcbjLicenceCertificate) {
			NcbjLicenceCertificate ncbjLicenceCertificate =
				(NcbjLicenceCertificate)result;

			if (!Objects.equals(caseId, ncbjLicenceCertificate.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJLICENCECERTIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJLICENCECERTIBY_CI_CASEID_2);
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

				List<NcbjLicenceCertificate> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbjLicenceCertiBy_CI,
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
								"NcbjLicenceCertificatePersistenceImpl.fetchBygetNcbjLicenceCertiBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjLicenceCertificate ncbjLicenceCertificate = list.get(0);

					result = ncbjLicenceCertificate;

					cacheResult(ncbjLicenceCertificate);
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
			return (NcbjLicenceCertificate)result;
		}
	}

	/**
	 * Removes the ncbj licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj licence certificate that was removed
	 */
	@Override
	public NcbjLicenceCertificate removeBygetNcbjLicenceCertiBy_CI(
			String caseId)
		throws NoSuchNcbjLicenceCertificateException {

		NcbjLicenceCertificate ncbjLicenceCertificate =
			findBygetNcbjLicenceCertiBy_CI(caseId);

		return remove(ncbjLicenceCertificate);
	}

	/**
	 * Returns the number of ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj licence certificates
	 */
	@Override
	public int countBygetNcbjLicenceCertiBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbjLicenceCertiBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJLICENCECERTIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJLICENCECERTIBY_CI_CASEID_2);
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
		_FINDER_COLUMN_GETNCBJLICENCECERTIBY_CI_CASEID_2 =
			"ncbjLicenceCertificate.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJLICENCECERTIBY_CI_CASEID_3 =
			"(ncbjLicenceCertificate.caseId IS NULL OR ncbjLicenceCertificate.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcbjLicCertiBy_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbjLicCertiBy_CI;
	private FinderPath _finderPathCountBygetNcbjLicCertiBy_CI;

	/**
	 * Returns all the ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId) {

		return findBygetNcbjLicCertiBy_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of matching ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end) {

		return findBygetNcbjLicCertiBy_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		return findBygetNcbjLicCertiBy_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcbjLicCertiBy_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbjLicCertiBy_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<NcbjLicenceCertificate> list = null;

		if (useFinderCache) {
			list = (List<NcbjLicenceCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjLicenceCertificate ncbjLicenceCertificate : list) {
					if (!caseId.equals(ncbjLicenceCertificate.getCaseId())) {
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

			sb.append(_SQL_SELECT_NCBJLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJLICCERTIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJLICCERTIBY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjLicenceCertificateModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjLicenceCertificate>)QueryUtil.list(
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
	 * Returns the first ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	@Override
	public NcbjLicenceCertificate findBygetNcbjLicCertiBy_CI_First(
			String caseId,
			OrderByComparator<NcbjLicenceCertificate> orderByComparator)
		throws NoSuchNcbjLicenceCertificateException {

		NcbjLicenceCertificate ncbjLicenceCertificate =
			fetchBygetNcbjLicCertiBy_CI_First(caseId, orderByComparator);

		if (ncbjLicenceCertificate != null) {
			return ncbjLicenceCertificate;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjLicenceCertificateException(sb.toString());
	}

	/**
	 * Returns the first ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	@Override
	public NcbjLicenceCertificate fetchBygetNcbjLicCertiBy_CI_First(
		String caseId,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		List<NcbjLicenceCertificate> list = findBygetNcbjLicCertiBy_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	@Override
	public NcbjLicenceCertificate findBygetNcbjLicCertiBy_CI_Last(
			String caseId,
			OrderByComparator<NcbjLicenceCertificate> orderByComparator)
		throws NoSuchNcbjLicenceCertificateException {

		NcbjLicenceCertificate ncbjLicenceCertificate =
			fetchBygetNcbjLicCertiBy_CI_Last(caseId, orderByComparator);

		if (ncbjLicenceCertificate != null) {
			return ncbjLicenceCertificate;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjLicenceCertificateException(sb.toString());
	}

	/**
	 * Returns the last ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	@Override
	public NcbjLicenceCertificate fetchBygetNcbjLicCertiBy_CI_Last(
		String caseId,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		int count = countBygetNcbjLicCertiBy_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<NcbjLicenceCertificate> list = findBygetNcbjLicCertiBy_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj licence certificates before and after the current ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the current ncbj licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public NcbjLicenceCertificate[] findBygetNcbjLicCertiBy_CI_PrevAndNext(
			long ncbjLicenceCertificateId, String caseId,
			OrderByComparator<NcbjLicenceCertificate> orderByComparator)
		throws NoSuchNcbjLicenceCertificateException {

		caseId = Objects.toString(caseId, "");

		NcbjLicenceCertificate ncbjLicenceCertificate = findByPrimaryKey(
			ncbjLicenceCertificateId);

		Session session = null;

		try {
			session = openSession();

			NcbjLicenceCertificate[] array = new NcbjLicenceCertificateImpl[3];

			array[0] = getBygetNcbjLicCertiBy_CI_PrevAndNext(
				session, ncbjLicenceCertificate, caseId, orderByComparator,
				true);

			array[1] = ncbjLicenceCertificate;

			array[2] = getBygetNcbjLicCertiBy_CI_PrevAndNext(
				session, ncbjLicenceCertificate, caseId, orderByComparator,
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

	protected NcbjLicenceCertificate getBygetNcbjLicCertiBy_CI_PrevAndNext(
		Session session, NcbjLicenceCertificate ncbjLicenceCertificate,
		String caseId,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJLICENCECERTIFICATE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJLICCERTIBY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETNCBJLICCERTIBY_CI_CASEID_2);
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
			sb.append(NcbjLicenceCertificateModelImpl.ORDER_BY_JPQL);
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
						ncbjLicenceCertificate)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjLicenceCertificate> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetNcbjLicCertiBy_CI(String caseId) {
		for (NcbjLicenceCertificate ncbjLicenceCertificate :
				findBygetNcbjLicCertiBy_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjLicenceCertificate);
		}
	}

	/**
	 * Returns the number of ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj licence certificates
	 */
	@Override
	public int countBygetNcbjLicCertiBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbjLicCertiBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJLICENCECERTIFICATE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJLICCERTIBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJLICCERTIBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJLICCERTIBY_CI_CASEID_2 =
		"ncbjLicenceCertificate.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJLICCERTIBY_CI_CASEID_3 =
		"(ncbjLicenceCertificate.caseId IS NULL OR ncbjLicenceCertificate.caseId = '')";

	public NcbjLicenceCertificatePersistenceImpl() {
		setModelClass(NcbjLicenceCertificate.class);

		setModelImplClass(NcbjLicenceCertificateImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjLicenceCertificateTable.INSTANCE);
	}

	/**
	 * Caches the ncbj licence certificate in the entity cache if it is enabled.
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 */
	@Override
	public void cacheResult(NcbjLicenceCertificate ncbjLicenceCertificate) {
		entityCache.putResult(
			NcbjLicenceCertificateImpl.class,
			ncbjLicenceCertificate.getPrimaryKey(), ncbjLicenceCertificate);

		finderCache.putResult(
			_finderPathFetchBygetNcbjLicenceCertiBy_CI,
			new Object[] {ncbjLicenceCertificate.getCaseId()},
			ncbjLicenceCertificate);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj licence certificates in the entity cache if it is enabled.
	 *
	 * @param ncbjLicenceCertificates the ncbj licence certificates
	 */
	@Override
	public void cacheResult(
		List<NcbjLicenceCertificate> ncbjLicenceCertificates) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjLicenceCertificates.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjLicenceCertificate ncbjLicenceCertificate :
				ncbjLicenceCertificates) {

			if (entityCache.getResult(
					NcbjLicenceCertificateImpl.class,
					ncbjLicenceCertificate.getPrimaryKey()) == null) {

				cacheResult(ncbjLicenceCertificate);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj licence certificates.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjLicenceCertificateImpl.class);

		finderCache.clearCache(NcbjLicenceCertificateImpl.class);
	}

	/**
	 * Clears the cache for the ncbj licence certificate.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjLicenceCertificate ncbjLicenceCertificate) {
		entityCache.removeResult(
			NcbjLicenceCertificateImpl.class, ncbjLicenceCertificate);
	}

	@Override
	public void clearCache(
		List<NcbjLicenceCertificate> ncbjLicenceCertificates) {

		for (NcbjLicenceCertificate ncbjLicenceCertificate :
				ncbjLicenceCertificates) {

			entityCache.removeResult(
				NcbjLicenceCertificateImpl.class, ncbjLicenceCertificate);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjLicenceCertificateImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjLicenceCertificateImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjLicenceCertificateModelImpl ncbjLicenceCertificateModelImpl) {

		Object[] args = new Object[] {
			ncbjLicenceCertificateModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbjLicenceCertiBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbjLicenceCertiBy_CI, args,
			ncbjLicenceCertificateModelImpl);
	}

	/**
	 * Creates a new ncbj licence certificate with the primary key. Does not add the ncbj licence certificate to the database.
	 *
	 * @param ncbjLicenceCertificateId the primary key for the new ncbj licence certificate
	 * @return the new ncbj licence certificate
	 */
	@Override
	public NcbjLicenceCertificate create(long ncbjLicenceCertificateId) {
		NcbjLicenceCertificate ncbjLicenceCertificate =
			new NcbjLicenceCertificateImpl();

		ncbjLicenceCertificate.setNew(true);
		ncbjLicenceCertificate.setPrimaryKey(ncbjLicenceCertificateId);

		ncbjLicenceCertificate.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjLicenceCertificate;
	}

	/**
	 * Removes the ncbj licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public NcbjLicenceCertificate remove(long ncbjLicenceCertificateId)
		throws NoSuchNcbjLicenceCertificateException {

		return remove((Serializable)ncbjLicenceCertificateId);
	}

	/**
	 * Removes the ncbj licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public NcbjLicenceCertificate remove(Serializable primaryKey)
		throws NoSuchNcbjLicenceCertificateException {

		Session session = null;

		try {
			session = openSession();

			NcbjLicenceCertificate ncbjLicenceCertificate =
				(NcbjLicenceCertificate)session.get(
					NcbjLicenceCertificateImpl.class, primaryKey);

			if (ncbjLicenceCertificate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjLicenceCertificateException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjLicenceCertificate);
		}
		catch (NoSuchNcbjLicenceCertificateException noSuchEntityException) {
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
	protected NcbjLicenceCertificate removeImpl(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjLicenceCertificate)) {
				ncbjLicenceCertificate = (NcbjLicenceCertificate)session.get(
					NcbjLicenceCertificateImpl.class,
					ncbjLicenceCertificate.getPrimaryKeyObj());
			}

			if (ncbjLicenceCertificate != null) {
				session.delete(ncbjLicenceCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjLicenceCertificate != null) {
			clearCache(ncbjLicenceCertificate);
		}

		return ncbjLicenceCertificate;
	}

	@Override
	public NcbjLicenceCertificate updateImpl(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		boolean isNew = ncbjLicenceCertificate.isNew();

		if (!(ncbjLicenceCertificate instanceof
				NcbjLicenceCertificateModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjLicenceCertificate.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjLicenceCertificate);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjLicenceCertificate proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjLicenceCertificate implementation " +
					ncbjLicenceCertificate.getClass());
		}

		NcbjLicenceCertificateModelImpl ncbjLicenceCertificateModelImpl =
			(NcbjLicenceCertificateModelImpl)ncbjLicenceCertificate;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjLicenceCertificate.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjLicenceCertificate.setCreateDate(date);
			}
			else {
				ncbjLicenceCertificate.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjLicenceCertificateModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjLicenceCertificate.setModifiedDate(date);
			}
			else {
				ncbjLicenceCertificate.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjLicenceCertificate);
			}
			else {
				ncbjLicenceCertificate = (NcbjLicenceCertificate)session.merge(
					ncbjLicenceCertificate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjLicenceCertificateImpl.class, ncbjLicenceCertificateModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjLicenceCertificateModelImpl);

		if (isNew) {
			ncbjLicenceCertificate.setNew(false);
		}

		ncbjLicenceCertificate.resetOriginalValues();

		return ncbjLicenceCertificate;
	}

	/**
	 * Returns the ncbj licence certificate with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public NcbjLicenceCertificate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjLicenceCertificateException {

		NcbjLicenceCertificate ncbjLicenceCertificate = fetchByPrimaryKey(
			primaryKey);

		if (ncbjLicenceCertificate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjLicenceCertificateException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjLicenceCertificate;
	}

	/**
	 * Returns the ncbj licence certificate with the primary key or throws a <code>NoSuchNcbjLicenceCertificateException</code> if it could not be found.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public NcbjLicenceCertificate findByPrimaryKey(
			long ncbjLicenceCertificateId)
		throws NoSuchNcbjLicenceCertificateException {

		return findByPrimaryKey((Serializable)ncbjLicenceCertificateId);
	}

	/**
	 * Returns the ncbj licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate, or <code>null</code> if a ncbj licence certificate with the primary key could not be found
	 */
	@Override
	public NcbjLicenceCertificate fetchByPrimaryKey(
		long ncbjLicenceCertificateId) {

		return fetchByPrimaryKey((Serializable)ncbjLicenceCertificateId);
	}

	/**
	 * Returns all the ncbj licence certificates.
	 *
	 * @return the ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj licence certificates
	 */
	@Override
	public List<NcbjLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator,
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

		List<NcbjLicenceCertificate> list = null;

		if (useFinderCache) {
			list = (List<NcbjLicenceCertificate>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJLICENCECERTIFICATE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJLICENCECERTIFICATE;

				sql = sql.concat(NcbjLicenceCertificateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjLicenceCertificate>)QueryUtil.list(
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
	 * Removes all the ncbj licence certificates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjLicenceCertificate ncbjLicenceCertificate : findAll()) {
			remove(ncbjLicenceCertificate);
		}
	}

	/**
	 * Returns the number of ncbj licence certificates.
	 *
	 * @return the number of ncbj licence certificates
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
					_SQL_COUNT_NCBJLICENCECERTIFICATE);

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
		return "ncbjLicenceCertificateId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJLICENCECERTIFICATE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjLicenceCertificateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj licence certificate persistence.
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

		_finderPathFetchBygetNcbjLicenceCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbjLicenceCertiBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcbjLicenceCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbjLicenceCertiBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetNcbjLicCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetNcbjLicCertiBy_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetNcbjLicCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetNcbjLicCertiBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetNcbjLicCertiBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbjLicCertiBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		NcbjLicenceCertificateUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjLicenceCertificateUtil.setPersistence(null);

		entityCache.removeCache(NcbjLicenceCertificateImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJLICENCECERTIFICATE =
		"SELECT ncbjLicenceCertificate FROM NcbjLicenceCertificate ncbjLicenceCertificate";

	private static final String _SQL_SELECT_NCBJLICENCECERTIFICATE_WHERE =
		"SELECT ncbjLicenceCertificate FROM NcbjLicenceCertificate ncbjLicenceCertificate WHERE ";

	private static final String _SQL_COUNT_NCBJLICENCECERTIFICATE =
		"SELECT COUNT(ncbjLicenceCertificate) FROM NcbjLicenceCertificate ncbjLicenceCertificate";

	private static final String _SQL_COUNT_NCBJLICENCECERTIFICATE_WHERE =
		"SELECT COUNT(ncbjLicenceCertificate) FROM NcbjLicenceCertificate ncbjLicenceCertificate WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjLicenceCertificate.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjLicenceCertificate exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjLicenceCertificate exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjLicenceCertificatePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}