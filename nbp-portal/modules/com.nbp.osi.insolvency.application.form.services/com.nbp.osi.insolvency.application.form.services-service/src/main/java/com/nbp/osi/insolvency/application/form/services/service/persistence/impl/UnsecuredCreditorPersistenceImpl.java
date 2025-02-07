/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence.impl;

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

import com.nbp.osi.insolvency.application.form.services.exception.NoSuchUnsecuredCreditorException;
import com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditor;
import com.nbp.osi.insolvency.application.form.services.model.UnsecuredCreditorTable;
import com.nbp.osi.insolvency.application.form.services.model.impl.UnsecuredCreditorImpl;
import com.nbp.osi.insolvency.application.form.services.model.impl.UnsecuredCreditorModelImpl;
import com.nbp.osi.insolvency.application.form.services.service.persistence.UnsecuredCreditorPersistence;
import com.nbp.osi.insolvency.application.form.services.service.persistence.UnsecuredCreditorUtil;
import com.nbp.osi.insolvency.application.form.services.service.persistence.impl.constants.OSI_INSOLVENCYPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the unsecured creditor service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = UnsecuredCreditorPersistence.class)
public class UnsecuredCreditorPersistenceImpl
	extends BasePersistenceImpl<UnsecuredCreditor>
	implements UnsecuredCreditorPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>UnsecuredCreditorUtil</code> to access the unsecured creditor persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		UnsecuredCreditorImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetOsiById;
	private FinderPath _finderPathWithoutPaginationFindBygetOsiById;
	private FinderPath _finderPathCountBygetOsiById;

	/**
	 * Returns all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching unsecured creditors
	 */
	@Override
	public List<UnsecuredCreditor> findBygetOsiById(long osiInsolvencyId) {
		return findBygetOsiById(
			osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @return the range of matching unsecured creditors
	 */
	@Override
	public List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end) {

		return findBygetOsiById(osiInsolvencyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching unsecured creditors
	 */
	@Override
	public List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		return findBygetOsiById(
			osiInsolvencyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching unsecured creditors
	 */
	@Override
	public List<UnsecuredCreditor> findBygetOsiById(
		long osiInsolvencyId, int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetOsiById;
				finderArgs = new Object[] {osiInsolvencyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOsiById;
			finderArgs = new Object[] {
				osiInsolvencyId, start, end, orderByComparator
			};
		}

		List<UnsecuredCreditor> list = null;

		if (useFinderCache) {
			list = (List<UnsecuredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (UnsecuredCreditor unsecuredCreditor : list) {
					if (osiInsolvencyId !=
							unsecuredCreditor.getOsiInsolvencyId()) {

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

			sb.append(_SQL_SELECT_UNSECUREDCREDITOR_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(UnsecuredCreditorModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

				list = (List<UnsecuredCreditor>)QueryUtil.list(
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
	 * Returns the first unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a matching unsecured creditor could not be found
	 */
	@Override
	public UnsecuredCreditor findBygetOsiById_First(
			long osiInsolvencyId,
			OrderByComparator<UnsecuredCreditor> orderByComparator)
		throws NoSuchUnsecuredCreditorException {

		UnsecuredCreditor unsecuredCreditor = fetchBygetOsiById_First(
			osiInsolvencyId, orderByComparator);

		if (unsecuredCreditor != null) {
			return unsecuredCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchUnsecuredCreditorException(sb.toString());
	}

	/**
	 * Returns the first unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unsecured creditor, or <code>null</code> if a matching unsecured creditor could not be found
	 */
	@Override
	public UnsecuredCreditor fetchBygetOsiById_First(
		long osiInsolvencyId,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		List<UnsecuredCreditor> list = findBygetOsiById(
			osiInsolvencyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a matching unsecured creditor could not be found
	 */
	@Override
	public UnsecuredCreditor findBygetOsiById_Last(
			long osiInsolvencyId,
			OrderByComparator<UnsecuredCreditor> orderByComparator)
		throws NoSuchUnsecuredCreditorException {

		UnsecuredCreditor unsecuredCreditor = fetchBygetOsiById_Last(
			osiInsolvencyId, orderByComparator);

		if (unsecuredCreditor != null) {
			return unsecuredCreditor;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("osiInsolvencyId=");
		sb.append(osiInsolvencyId);

		sb.append("}");

		throw new NoSuchUnsecuredCreditorException(sb.toString());
	}

	/**
	 * Returns the last unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unsecured creditor, or <code>null</code> if a matching unsecured creditor could not be found
	 */
	@Override
	public UnsecuredCreditor fetchBygetOsiById_Last(
		long osiInsolvencyId,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		int count = countBygetOsiById(osiInsolvencyId);

		if (count == 0) {
			return null;
		}

		List<UnsecuredCreditor> list = findBygetOsiById(
			osiInsolvencyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the unsecured creditors before and after the current unsecured creditor in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param unsecuredCreditorId the primary key of the current unsecured creditor
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	@Override
	public UnsecuredCreditor[] findBygetOsiById_PrevAndNext(
			long unsecuredCreditorId, long osiInsolvencyId,
			OrderByComparator<UnsecuredCreditor> orderByComparator)
		throws NoSuchUnsecuredCreditorException {

		UnsecuredCreditor unsecuredCreditor = findByPrimaryKey(
			unsecuredCreditorId);

		Session session = null;

		try {
			session = openSession();

			UnsecuredCreditor[] array = new UnsecuredCreditorImpl[3];

			array[0] = getBygetOsiById_PrevAndNext(
				session, unsecuredCreditor, osiInsolvencyId, orderByComparator,
				true);

			array[1] = unsecuredCreditor;

			array[2] = getBygetOsiById_PrevAndNext(
				session, unsecuredCreditor, osiInsolvencyId, orderByComparator,
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

	protected UnsecuredCreditor getBygetOsiById_PrevAndNext(
		Session session, UnsecuredCreditor unsecuredCreditor,
		long osiInsolvencyId,
		OrderByComparator<UnsecuredCreditor> orderByComparator,
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

		sb.append(_SQL_SELECT_UNSECUREDCREDITOR_WHERE);

		sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

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
			sb.append(UnsecuredCreditorModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(osiInsolvencyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						unsecuredCreditor)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<UnsecuredCreditor> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the unsecured creditors where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	@Override
	public void removeBygetOsiById(long osiInsolvencyId) {
		for (UnsecuredCreditor unsecuredCreditor :
				findBygetOsiById(
					osiInsolvencyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(unsecuredCreditor);
		}
	}

	/**
	 * Returns the number of unsecured creditors where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching unsecured creditors
	 */
	@Override
	public int countBygetOsiById(long osiInsolvencyId) {
		FinderPath finderPath = _finderPathCountBygetOsiById;

		Object[] finderArgs = new Object[] {osiInsolvencyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_UNSECUREDCREDITOR_WHERE);

			sb.append(_FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiInsolvencyId);

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

	private static final String _FINDER_COLUMN_GETOSIBYID_OSIINSOLVENCYID_2 =
		"unsecuredCreditor.osiInsolvencyId = ?";

	public UnsecuredCreditorPersistenceImpl() {
		setModelClass(UnsecuredCreditor.class);

		setModelImplClass(UnsecuredCreditorImpl.class);
		setModelPKClass(long.class);

		setTable(UnsecuredCreditorTable.INSTANCE);
	}

	/**
	 * Caches the unsecured creditor in the entity cache if it is enabled.
	 *
	 * @param unsecuredCreditor the unsecured creditor
	 */
	@Override
	public void cacheResult(UnsecuredCreditor unsecuredCreditor) {
		entityCache.putResult(
			UnsecuredCreditorImpl.class, unsecuredCreditor.getPrimaryKey(),
			unsecuredCreditor);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the unsecured creditors in the entity cache if it is enabled.
	 *
	 * @param unsecuredCreditors the unsecured creditors
	 */
	@Override
	public void cacheResult(List<UnsecuredCreditor> unsecuredCreditors) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (unsecuredCreditors.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (UnsecuredCreditor unsecuredCreditor : unsecuredCreditors) {
			if (entityCache.getResult(
					UnsecuredCreditorImpl.class,
					unsecuredCreditor.getPrimaryKey()) == null) {

				cacheResult(unsecuredCreditor);
			}
		}
	}

	/**
	 * Clears the cache for all unsecured creditors.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UnsecuredCreditorImpl.class);

		finderCache.clearCache(UnsecuredCreditorImpl.class);
	}

	/**
	 * Clears the cache for the unsecured creditor.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UnsecuredCreditor unsecuredCreditor) {
		entityCache.removeResult(
			UnsecuredCreditorImpl.class, unsecuredCreditor);
	}

	@Override
	public void clearCache(List<UnsecuredCreditor> unsecuredCreditors) {
		for (UnsecuredCreditor unsecuredCreditor : unsecuredCreditors) {
			entityCache.removeResult(
				UnsecuredCreditorImpl.class, unsecuredCreditor);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(UnsecuredCreditorImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(UnsecuredCreditorImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new unsecured creditor with the primary key. Does not add the unsecured creditor to the database.
	 *
	 * @param unsecuredCreditorId the primary key for the new unsecured creditor
	 * @return the new unsecured creditor
	 */
	@Override
	public UnsecuredCreditor create(long unsecuredCreditorId) {
		UnsecuredCreditor unsecuredCreditor = new UnsecuredCreditorImpl();

		unsecuredCreditor.setNew(true);
		unsecuredCreditor.setPrimaryKey(unsecuredCreditorId);

		unsecuredCreditor.setCompanyId(CompanyThreadLocal.getCompanyId());

		return unsecuredCreditor;
	}

	/**
	 * Removes the unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor that was removed
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	@Override
	public UnsecuredCreditor remove(long unsecuredCreditorId)
		throws NoSuchUnsecuredCreditorException {

		return remove((Serializable)unsecuredCreditorId);
	}

	/**
	 * Removes the unsecured creditor with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the unsecured creditor
	 * @return the unsecured creditor that was removed
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	@Override
	public UnsecuredCreditor remove(Serializable primaryKey)
		throws NoSuchUnsecuredCreditorException {

		Session session = null;

		try {
			session = openSession();

			UnsecuredCreditor unsecuredCreditor =
				(UnsecuredCreditor)session.get(
					UnsecuredCreditorImpl.class, primaryKey);

			if (unsecuredCreditor == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUnsecuredCreditorException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(unsecuredCreditor);
		}
		catch (NoSuchUnsecuredCreditorException noSuchEntityException) {
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
	protected UnsecuredCreditor removeImpl(
		UnsecuredCreditor unsecuredCreditor) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(unsecuredCreditor)) {
				unsecuredCreditor = (UnsecuredCreditor)session.get(
					UnsecuredCreditorImpl.class,
					unsecuredCreditor.getPrimaryKeyObj());
			}

			if (unsecuredCreditor != null) {
				session.delete(unsecuredCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (unsecuredCreditor != null) {
			clearCache(unsecuredCreditor);
		}

		return unsecuredCreditor;
	}

	@Override
	public UnsecuredCreditor updateImpl(UnsecuredCreditor unsecuredCreditor) {
		boolean isNew = unsecuredCreditor.isNew();

		if (!(unsecuredCreditor instanceof UnsecuredCreditorModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(unsecuredCreditor.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					unsecuredCreditor);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in unsecuredCreditor proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom UnsecuredCreditor implementation " +
					unsecuredCreditor.getClass());
		}

		UnsecuredCreditorModelImpl unsecuredCreditorModelImpl =
			(UnsecuredCreditorModelImpl)unsecuredCreditor;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (unsecuredCreditor.getCreateDate() == null)) {
			if (serviceContext == null) {
				unsecuredCreditor.setCreateDate(date);
			}
			else {
				unsecuredCreditor.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!unsecuredCreditorModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				unsecuredCreditor.setModifiedDate(date);
			}
			else {
				unsecuredCreditor.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(unsecuredCreditor);
			}
			else {
				unsecuredCreditor = (UnsecuredCreditor)session.merge(
					unsecuredCreditor);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			UnsecuredCreditorImpl.class, unsecuredCreditorModelImpl, false,
			true);

		if (isNew) {
			unsecuredCreditor.setNew(false);
		}

		unsecuredCreditor.resetOriginalValues();

		return unsecuredCreditor;
	}

	/**
	 * Returns the unsecured creditor with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the unsecured creditor
	 * @return the unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	@Override
	public UnsecuredCreditor findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUnsecuredCreditorException {

		UnsecuredCreditor unsecuredCreditor = fetchByPrimaryKey(primaryKey);

		if (unsecuredCreditor == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUnsecuredCreditorException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return unsecuredCreditor;
	}

	/**
	 * Returns the unsecured creditor with the primary key or throws a <code>NoSuchUnsecuredCreditorException</code> if it could not be found.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor
	 * @throws NoSuchUnsecuredCreditorException if a unsecured creditor with the primary key could not be found
	 */
	@Override
	public UnsecuredCreditor findByPrimaryKey(long unsecuredCreditorId)
		throws NoSuchUnsecuredCreditorException {

		return findByPrimaryKey((Serializable)unsecuredCreditorId);
	}

	/**
	 * Returns the unsecured creditor with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param unsecuredCreditorId the primary key of the unsecured creditor
	 * @return the unsecured creditor, or <code>null</code> if a unsecured creditor with the primary key could not be found
	 */
	@Override
	public UnsecuredCreditor fetchByPrimaryKey(long unsecuredCreditorId) {
		return fetchByPrimaryKey((Serializable)unsecuredCreditorId);
	}

	/**
	 * Returns all the unsecured creditors.
	 *
	 * @return the unsecured creditors
	 */
	@Override
	public List<UnsecuredCreditor> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @return the range of unsecured creditors
	 */
	@Override
	public List<UnsecuredCreditor> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unsecured creditors
	 */
	@Override
	public List<UnsecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the unsecured creditors.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>UnsecuredCreditorModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of unsecured creditors
	 * @param end the upper bound of the range of unsecured creditors (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of unsecured creditors
	 */
	@Override
	public List<UnsecuredCreditor> findAll(
		int start, int end,
		OrderByComparator<UnsecuredCreditor> orderByComparator,
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

		List<UnsecuredCreditor> list = null;

		if (useFinderCache) {
			list = (List<UnsecuredCreditor>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_UNSECUREDCREDITOR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_UNSECUREDCREDITOR;

				sql = sql.concat(UnsecuredCreditorModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<UnsecuredCreditor>)QueryUtil.list(
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
	 * Removes all the unsecured creditors from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UnsecuredCreditor unsecuredCreditor : findAll()) {
			remove(unsecuredCreditor);
		}
	}

	/**
	 * Returns the number of unsecured creditors.
	 *
	 * @return the number of unsecured creditors
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_UNSECUREDCREDITOR);

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
		return "unsecuredCreditorId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_UNSECUREDCREDITOR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return UnsecuredCreditorModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the unsecured creditor persistence.
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

		_finderPathWithPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOsiById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathWithoutPaginationFindBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, true);

		_finderPathCountBygetOsiById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetOsiById",
			new String[] {Long.class.getName()},
			new String[] {"osiInsolvencyId"}, false);

		UnsecuredCreditorUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		UnsecuredCreditorUtil.setPersistence(null);

		entityCache.removeCache(UnsecuredCreditorImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_INSOLVENCYPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_UNSECUREDCREDITOR =
		"SELECT unsecuredCreditor FROM UnsecuredCreditor unsecuredCreditor";

	private static final String _SQL_SELECT_UNSECUREDCREDITOR_WHERE =
		"SELECT unsecuredCreditor FROM UnsecuredCreditor unsecuredCreditor WHERE ";

	private static final String _SQL_COUNT_UNSECUREDCREDITOR =
		"SELECT COUNT(unsecuredCreditor) FROM UnsecuredCreditor unsecuredCreditor";

	private static final String _SQL_COUNT_UNSECUREDCREDITOR_WHERE =
		"SELECT COUNT(unsecuredCreditor) FROM UnsecuredCreditor unsecuredCreditor WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "unsecuredCreditor.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No UnsecuredCreditor exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No UnsecuredCreditor exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		UnsecuredCreditorPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}